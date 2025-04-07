package com.hangman.game;

import java.util.Scanner;

import com.hangman.game.util.Man;
import com.hangman.game.util.Word;

public class GameLoop {
  private static boolean end = false;
  private static boolean won = false;
  private static boolean lost = false;

  public static void gameLoop() {    
    Word.reset();
    Man.reset();
    Word.genRandomWord();
    end = false;
    won = false;
    lost = false;
    while (!end) {
      if(Man.getLost()) { lost = true; end = true; }
      GameLoopFrame.displayInfo(lost, won); // Display frame
      @SuppressWarnings("resource")
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      checkInput(input);
    }
  } 

  private static void checkInput(String input) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    if(input.length() == 1) { // User has input a character
      Word.checkChar(input.charAt(0));
    } else if(input.length() > 1) { // User has input a word
      if(Word.checkWord(input)) {
        won = true;
        GameLoopFrame.displayInfo(lost, won); // Display frame
        scanner.nextLine();
        end = true;
      }
    }
  }
}

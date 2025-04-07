package com.hangman;

import java.util.Scanner;

public class Game {
  private static boolean gameLoop = false;

  public Game() { 
    gameLoop(); 
  }

  private static void gameLoop() {    
    Word.reset();
    Word.genRandomWord();
    
    while (!gameLoop) {
      System.out.print("\033c\033[2J");

      System.out.println(Man.getMan());
      if(Man.getLost()) { System.out.println("You lost!"); gameLoop = true; } 
      else { displayInfo(); }
    }
  } 

  private static void displayInfo() {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.println("> Word: "+Word.getWordHidden());
    System.out.println("> Errors: "+Man.getFails());
    System.out.println("> Used characters: "+Word.getUsedChars());
    System.out.print("> Input a character or word: ");
    String input = scanner.nextLine();
    checkInput(input);
  }

  private static void checkInput(String input) {
    if(input.length() == 1) { // User has input a character
      Word.checkChar(input.charAt(0));
    } else if(input.length() > 1) { // User has input a word
      gameLoop = Word.checkWord(input);
      if(gameLoop) {
        System.out.println("You won!");
        gameLoop = true;
      }
    }
  }
}

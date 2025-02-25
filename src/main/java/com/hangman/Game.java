package com.hangman;

import java.util.Scanner;

public class Game {
  public Game() { 
    gameLoop(); 
  }

  private static void gameLoop() {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    Word.reset();
    Word.genRandomWord();
    
    boolean correct = false;
    while (!correct) {
      System.out.println("> ---------------------------------------- <");
      System.out.println("> Word: "+Word.getWordHidden());
      System.out.println("> Used characters: "+Word.getUsedChars());
      System.out.print("> Input a character or word: ");
      String input = scanner.nextLine();
      System.out.println("> ---------------------------------------- <");


      if(input.length() == 1) { // User has input a character
        Word.checkChar(input.charAt(0));
      } else if(input.length() > 1) { // User has input a word
        correct = Word.checkWord(input);
        if(correct) System.out.println("Correct!");
      }
    }
  }
}

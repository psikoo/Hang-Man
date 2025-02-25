package com.hangman;

import java.util.Scanner;

public class Game {
  public Game() { 
    gameLoop(); 
  }

  private static void gameLoop() {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    //Word.reset(); vacia las letras usadas
    boolean exit = false;
    while (!exit) {
      String word = "test"; //Word.getRandomWord();
      System.out.println("Used characters: "); //+Word.getUsedChars()
      System.out.print("Input a character or word: ");
      String input = scanner.nextLine();
      if(input.length() == 1) {
        //Word.checkChar(word, char)
      } else if(input.length() > 1) {
        if(input == word) {
          System.out.println("CORRECT");
        } else {
          System.out.println("Womp Womp wrong");
        }
      }
    }
  }
}

package com.hangman.setup;

import java.util.Scanner;

import com.hangman.lib.Frame;

public class SetupFrame {
  private static int height = 20;               //* Base height
  private static int width = 100;               //* Base width
  private static boolean confirmHeight = false; //* Height has been confirmed
  private static boolean confirmWidth = false;  //* Width has been confirmed

  public static int selectHeight() {
    confirmHeight = false;
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    //? Input is not 'c'
    while (!confirmHeight) {
      //* Draw frame
      new Frame(height, width, Frame.borderBuilder(1))
      .setWindowString(0, true, "[ Size Setup ]") 
      .setWindowString(2, true, "- Select the correct height -") 
      .setWindowString(3, true, "leave 2 empty lines at the bottom") 
      .divider(5)
      .setWindowString(2, 6, "[ height = "+height+" ]") 
      .setWindowString(2, 7, "[ width = "+width+" ]")
      .setWindowString(2, 9, "[ +num ] height + number") 
      .setWindowString(2, 10, "[ -num ] height - number")
      .setWindowString(2, 11, "[ c ] confirm") 
      .print();
      //* Controls
      String input = scanner.nextLine();
      if(input.isBlank() || input.isEmpty());
      else if(input.equals("c")) confirmHeight = true;
      else if(input.charAt(0) == '+') height+=extractNumber(input);
      else if(input.charAt(0) == '-') height-=extractNumber(input);
    }
    return height;
  }
  public static int selectWidth() {
    confirmWidth = false;
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    //? Input is not 'c'
    while (!confirmWidth) {
      //* Draw frame
      new Frame(height, width, Frame.borderBuilder(1))
      .setWindowString(0, true, "[ Size Setup ]")
      .setWindowString(2, true, "- Select the correct width -")
      .divider(5)
      .setWindowString(2,6, "[ height = "+height+" ]")
      .setWindowString(2,7, "[ width = "+width+" ]")
      .setWindowString(2,9, "[ +num ] width + number") 
      .setWindowString(2,10, "[ -num ] width - number")
      .setWindowString(2,11, "[ c ] confirm") 
      .print();
      //* Controls
      String input = scanner.nextLine();
      if(input.equalsIgnoreCase("c")) confirmWidth = true;
      else if(input.charAt(0) == '+') width+=extractNumber(input);
      else if(input.charAt(0) == '-') width-=extractNumber(input);
    }
    return width;
  }

  private static int extractNumber(String string) {
    //? (String)+25 => (int)25
    try { return Integer.parseInt(string.substring(1)); } 
    catch (NumberFormatException ignore) { return 0; }
  }
}
package com.hangman;

import java.util.Scanner;

import com.hangman.game.Game;
import com.hangman.setup.Setup;

public class Main {
  public static void main( String[] args ) { 
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    // mvn clean validate compile site assembly:assembly -DdescriptorId=jar-with-dependencies exec:exec
    // sudo mvn clean validate compile site assembly:assembly -DdescriptorId=jar-with-dependencies
    // Ansi check
    System.out.println("\nIf you are seeing this run the following command and rerun the program (⚠Windows)");
    System.out.println("reg add HKEY_CURRENT_USER\\Console /v VirtualTerminalLevel /t REG_DWORD /d 0x00000001 /f");
    System.out.print("\033c\033[2J");
    // Full screen prompt
    System.out.println("Please make this window full screen for a better experience");
    System.out.println("> Press enter to continue...");
    scanner.nextLine();
    // Game
    new Setup();
    new Game();
  }
}

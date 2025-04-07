package com.hangman;

public class Main {
    public static void main( String[] args ) { 
        // mvn clean validate compile site assembly:assembly -DdescriptorId=jar-with-dependencies exec:exec
        // sudo mvn clean validate compile site assembly:assembly -DdescriptorId=jar-with-dependencies
        // Ansi check
        System.out.println("\nIf you are seeing this run the following command and rerun the program (⚠Windows)");
        System.out.println("reg add HKEY_CURRENT_USER\\Console /v VirtualTerminalLevel /t REG_DWORD /d 0x00000001 /f");
        System.out.print("\033c\033[2J");
        // Game
        new Game();
    }
}

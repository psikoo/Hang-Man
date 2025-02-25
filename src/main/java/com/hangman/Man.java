package com.hangman;

public class Man {
    public static void hombrecillo() {
        String[] estados = {
            "   +---+\n   |   |\n       |\n       |\n       |\n       |\n =========\n",
            "   +---+\n   |   |\n   O   |\n       |\n       |\n       |\n =========\n",
            "   +---+\n   |   |\n   O   |\n   |   |\n       |\n       |\n =========\n",
            "   +---+\n   |   |\n   O   |\n  /|   |\n       |\n       |\n =========\n",
            "   +---+\n   |   |\n   O   |\n  /|\\  |\n       |\n       |\n =========\n",
            "   +---+\n   |   |\n   O   |\n  /|\\  |\n  /    |\n       |\n =========\n",
            "   +---+\n   |   |\n   O   |\n  /|\\  |\n  / \\  |\n       |\n =========\n",
            "   +---+\n   |   |\n   O  |\n  /|\\  |\n  / \\  |\n       |\n =========\n"
        };
        
        for (String estado : estados) {
            System.out.println(estado);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        hombrecillo();
    }
}

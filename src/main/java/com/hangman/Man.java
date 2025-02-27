package com.hangman;

public class Man {
    private static boolean lost = false;
    private static int fails = 0;
    private static String[] states = {
        "   +---+\n   |   |\n       |\n       |\n       |\n       |\n=========",
        "   +---+\n   |   |\n   O   |\n       |\n       |\n       |\n=========",
        "   +---+\n   |   |\n   O   |\n   |   |\n       |\n       |\n=========",
        "   +---+\n   |   |\n   O   |\n  /|   |\n       |\n       |\n=========",
        "   +---+\n   |   |\n   O   |\n  /|\\  |\n       |\n       |\n=========",
        "   +---+\n   |   |\n   O   |\n  /|\\  |\n  /    |\n       |\n=========",
        "   +---+\n   |   |\n   O   |\n  /|\\  |\n  / \\  |\n       |\n========="
    };
    
    public static boolean getLost() { return lost; }
    public static int getFails() { return fails; }
    public static String getMan() { return states[fails]; }
    public static void increaseFails() { 
        if(fails < states.length-2) { fails += 1; }
        else { 
            fails += 1;
            lost = true; 
        }
    }
}

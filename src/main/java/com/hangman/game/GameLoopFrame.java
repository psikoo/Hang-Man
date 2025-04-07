package com.hangman.game;

import com.hangman.game.util.Man;
import com.hangman.game.util.Word;
import com.hangman.lib.Frame;

public class GameLoopFrame {
  private static int height = 0;
  private static int width = 0;
  public static void setHeight(int height) { GameLoopFrame.height = height; }
  public static void setWidth(int width) { GameLoopFrame.width = width; }

  public static void displayInfo(boolean  lost, boolean  won) {
    int yOffset = (height/2)-7;
    Frame frame = new Frame(height, width, Frame.borderBuilder(1))
    .setWindowString(0+yOffset, true, Man.getMan()[0]) 
    .setWindowString(1+yOffset, true, Man.getMan()[1]) 
    .setWindowString(2+yOffset, true, Man.getMan()[2]) 
    .setWindowString(3+yOffset, true, Man.getMan()[3]) 
    .setWindowString(4+yOffset, true, Man.getMan()[4]) 
    .setWindowString(5+yOffset, true, Man.getMan()[5]) 
    .setWindowString(6+yOffset, true, Man.getMan()[6]) 
    .setWindowString(8+yOffset, true, "Word: "+Word.getWordHidden()+" (errors: "+Man.getFails()+")") 
    .setWindowString(9+yOffset, true, "Used characters: "+Word.getUsedChars());
    
    if(won) frame.setWindowString(11+yOffset, true, "You won! (Press entre to play again)");
    if(lost) frame.setWindowString(11+yOffset, true, "You lost! (The correct word was '"+Word.getWord()+"')").setWindowString(12+yOffset, true, "(Press entre to play again)");

    frame.print();
    System.out.print("> Input a character or word: ");
  }
}

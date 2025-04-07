package com.hangman.setup;

import com.hangman.game.GameLoopFrame;

public class Setup {
  public Setup() {
    GameLoopFrame.setHeight(SetupFrame.selectHeight());
    GameLoopFrame.setWidth(SetupFrame.selectWidth());
  }
}
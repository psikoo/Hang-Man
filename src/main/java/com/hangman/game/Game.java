package com.hangman.game;

import com.hangman.game.util.Word;

public class Game {
  public Game() {
    new Word(); // Add words to array list
    while (true) { GameLoop.gameLoop(); }
  }
}

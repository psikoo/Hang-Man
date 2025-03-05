package com.hangman;

import java.util.ArrayList;
import java.util.Random;

public class Word {
  private static String word = "";
  private static String wordHidden = "";
  private static ArrayList<String> words = new ArrayList<>();
  private static ArrayList<String> usedChars = new ArrayList<>();

  public static String getWord() { return word; }
  public static String getWordHidden() { return wordHidden; }
  public static ArrayList<String> getUsedChars() { return usedChars; }

  public static void reset() { 
    word = "";
    wordHidden = "";
    usedChars.clear(); 
  }

  public static void genRandomWord() {
    words.add("caca");
    words.add("pis");
    words.add("semen");
    words.add("carlos");

    Random random = new Random();
    String randomWord = words.get(random.nextInt(words.size()));
    word = randomWord;
    wordHidden = "-".repeat(word.length());
  }

  public static void checkChar(char character) {
    int count = 0;
    usedChars.add(String.valueOf(character));
    char[] wordHiddenChar = wordHidden.toCharArray();
    for(int i = 0; i < word.length(); i++) {
      if(word.charAt(i) == character) {
        count += 1;
        wordHiddenChar[i] = character;
      }
    }
    wordHidden = String.valueOf(wordHiddenChar);
    if(count == 0) { Man.increaseFails(); }
  }

  public static boolean checkWord(String input) {
    if(input.equals(word)) {
      return true;
    } else {
      Man.increaseFails();
      return false;
    }
  }
}

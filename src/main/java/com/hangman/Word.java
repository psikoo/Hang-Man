package com.hangman;

public class Word {
    
import java.util.ArrayList;
import java.util.Random;

public class Word {
    private ArrayList<String> allWords;  // Todas las palabras del juego
    private ArrayList<String> usedWords; // Palabras que ya se usaron

    public Word() {
        allWords = new ArrayList<>();
        usedWords = new ArrayList<>();

        // A
        allWords.add("caca");
        allWords.add("pis");
       allWords.add("semen");
       allWords.add("carlos");
    }

    // Método para elegir una palabra aleatoria que no haya sido usada
    public String getRandomWord() {
        if (allWords.size() == usedWords.size()) {
            return null; // Si ya usaste todas las palabras, no hay más disponibles
        }

        Random rand = new Random();
        String selectedWord;
        
        do {
            selectedWord = allWords.get(rand.nextInt(allWords.size()));
        } while (usedWords.contains(selectedWord)); // Evitar repetir palabras usadas

        usedWords.add(selectedWord);
        return selectedWord;
    }

    // Método para reiniciar las palabras usadas (opcional)
    public void resetUsedWords() {
        usedWords.clear();
    }

    // Métodos para acceder a las listas si se necesitan
    public ArrayList<String> getAllWords() {
        return allWords;
    }

    public ArrayList<String> getUsedWords() {
        return usedWords;
    }
}




}

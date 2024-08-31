package DesignPatterns.StructuralDesignPattern.FlyweightPattern.TextEditor;

import java.util.*;

public class LatterFactory {
    private static Map<Character, Letter> letterMap = new HashMap<>();

    public static Letter createLetter(char character) {
        if(letterMap.containsKey(character)) {
            return letterMap.get(character);
        } else {
            DocumentCharacter letter = new DocumentCharacter(character, "Arial", 12);
            letterMap.put(character, letter);
            return letter;
        }
    }
}

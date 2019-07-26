/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfindermethod2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author salarcon
 */
public class StringFinderMethod2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "hola hola hola ohla hoal";
        String word = "hola";
        MapFiller mapFiller = new MapFiller();
        LettersFinder lettersFinder = new LettersFinder();
        Map<Character, Integer> wordCharacters = new HashMap<>();
        Map<Character, Integer> textCharacters = new HashMap<>() ;
       
        mapFiller.fillMapWithTextCharacters(word, wordCharacters);
        mapFiller.fillMapWithTextCharacters(text, textCharacters);
        System.out.println(lettersFinder.findAllLettersIntoText(text, wordCharacters, textCharacters));
    }
}

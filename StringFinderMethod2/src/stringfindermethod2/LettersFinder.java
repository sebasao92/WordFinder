/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfindermethod2;

import java.util.Map;

/**
 *
 * @author salarcon
 */
public class LettersFinder {
    
    public int findAllLettersIntoText(String text, Map<Character, Integer> wordCharacters, Map<Character, Integer> textCharacters){
        
        int numberOfTimes = 0;
        boolean found = true;
        
        while(found) {
            for(char ch : wordCharacters.keySet()){
                if(wordCharacters.get(ch) <= textCharacters.get(ch)){
                    textCharacters.put(ch, textCharacters.get(ch) - wordCharacters.get(ch));
                } else {
                    found = false;
                }
            }
            numberOfTimes++;
        }

        return numberOfTimes - 1;
    }
}

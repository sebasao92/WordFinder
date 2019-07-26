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
public class MapFiller {
    
    public void fillMapWithTextCharacters(String text, Map<Character, Integer> textCharacters) {
        
        for(char ch : text.toCharArray()){
        if(!textCharacters.containsKey(ch))
            textCharacters.put(ch, 1);
        else
            textCharacters.put(ch, textCharacters.get(ch)+1);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfindermethod1;

import java.util.List;

/**
 *
 * @author salarcon
 */
public class StringFinder {
    
    public static int findTimesWordIntoText(String word, String text){
        List<Character> textAsList = StringConverter.stringToArrayList(text);
        int numberOfTimes = 0;
        
        while(true) {
            if(findWordintoArrayList(word, textAsList)){
                numberOfTimes++;
            } else {
                break;
            }
        }
            
        return numberOfTimes;
    }
    
    public static boolean findWordintoArrayList(String word, List<Character> arrayList){
        
        int lettersCounter = 0;
        for(char ch : word.toCharArray()){
            for(int i = 0; i < arrayList.size(); i++){
                if(arrayList.get(i) == ch){
                    lettersCounter++;
                    arrayList.remove(i);
                    break;
                }
            }
        }
        
        return lettersCounter == word.length();
    }
    
}

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
public class StringFinderMethod1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "hola hola hola ohla";
        String word = "hola";
        int numberOfTimes = StringFinder.findTimesWordIntoText(word, text);
        System.out.println("The word is " + numberOfTimes +" times into the text");
    }
    
}

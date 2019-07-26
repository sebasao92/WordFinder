/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfindermethod3;

/**
 *
 * @author salarcon
 */
public class StringFinderMethod3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "hola hola hola ohla hoal";
        String word = "holaa";
        LettersFinder lettersFinder = new LettersFinder(word);
        System.out.println(lettersFinder.findTimesWordIntoText(text));
        // TODO code application logic here
    }
    
}

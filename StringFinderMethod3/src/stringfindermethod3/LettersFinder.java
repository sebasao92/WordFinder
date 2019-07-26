package stringfindermethod3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salarcon
 */
public class LettersFinder {

    int [] lettersCountersForWord = new int[30];
    char [] letters = new char[30];
    int numberOfLetters = 0;
    
    LettersFinder(String word){
        findAllLettersIntoWord(word);
        findNumberOfLetters();
    }
    
    /**
     *
     * @param word
     */
    public final void findAllLettersIntoWord(String word){    
        
        boolean found = false;
        for(int i=0; i<word.length(); i++){
            for(int j=0; j<letters.length; j++){
                if(letters[j] == word.charAt(i)){
                    lettersCountersForWord[j]++;
                    found=true;
                } else if(letters[j] == 0x0 && !found){
                    letters[j] = word.charAt(i);
                    lettersCountersForWord[j] = 1;
                    found = false;
                    break;
                }
            }
        }
    }
    
    /**
     *
     */
    public final void findNumberOfLetters(){
        
        for(int i=0; i<letters.length; i++){
            if(letters[i] != 0x0){
                numberOfLetters++;
            } else {
                break;
            }
        }
    }
    
    public int findTimesWordIntoText(String text) {
        
        int [] lettersCountersForText = new int[30];
        int lettersCounter = 0;
        int wordCounter = 0;
        
        for(int i=0; i<letters.length; i++){
            for(char cht : text.toCharArray()){
                if(letters[i] == cht){
                    lettersCountersForText[i]++;
                }
            }
        }
        
        for(int i=0; i<numberOfLetters; i++){
            if(lettersCountersForText[i] >= lettersCountersForWord[i]){
                lettersCounter++;
                lettersCountersForText[i] -= lettersCountersForWord[i];
            }
            if(i == (numberOfLetters - 1) && lettersCounter == numberOfLetters){
                i = -1;
                wordCounter++;
                lettersCounter = 0;
            }
        }
        
        return wordCounter;
    }
}

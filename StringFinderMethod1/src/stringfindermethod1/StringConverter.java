/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfindermethod1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salarcon
 */
public class StringConverter {
    
    public static List<Character> stringToArrayList(String string){
        
        List<Character> arrayList = new ArrayList<>();
        for(char ch : string.toCharArray()){
            arrayList.add(ch);
        }
        return arrayList;
    }
}

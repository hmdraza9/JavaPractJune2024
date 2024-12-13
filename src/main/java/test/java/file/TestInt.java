package Utils;

import java.util.Arrays;
import java.util.List;

public class TestInt {

    public static void main(String[] args){

        String str = "HamidRa1232^&Hello";
        List<String> allChars = Arrays.asList((str.replaceAll(" ", "")).split(""));
        List<String> listOfVowels = Arrays.asList("a","e","i","o","u");
        StringBuilder noVowels = new StringBuilder();
        

        for(int i=0;i<allChars.size();i++){
            if(!listOfVowels.contains(allChars.get(i))){
                noVowels.append(allChars.get(i));
            }
        }

        System.out.println("Vowels removed: "+noVowels);
    }

}

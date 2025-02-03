package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findCommonString {

    private static final String[][] testCases = {
            {"flower", "flow", "flight"},
            {"dog", "racecar", "car"},
            {"interspecies", "interstellar", "interstate"},
            {"apple", "ape", "april"},
            {"java", "javascript", "javelin"},
            {"hello", "hello", "hello"},
            {"abc", "abcd", "ab"},
            {"prefix", "pretest", "present", "predict"},
            {"unique", "words", "here"}
    };

    public static void main(String[] aa){
        for(String[] dataSet : testCases) {
            System.out.println("Data set: " + Arrays.toString(dataSet));
            System.out.println("Common string is: " + findaCommonString(Arrays.asList(dataSet)));
            System.out.println("\n\n\n");
        }
    }

    private static String findaCommonString(List<String> wordList){


        String smallW = wordList.get(0);

        for(String stt : wordList){
            if(stt.length()<smallW.length()){
                smallW = stt;
            }
        }
        System.out.println("Smallest word: "+smallW);

        String commonStr = "";

        for(int i=0;i<smallW.length();i++){
            for(String tt : wordList){
                System.out.println("Subject word : "+(i)+". "+tt);
                if(tt.startsWith(smallW.substring(0,i))) {
                    System.out.println("Subject word starts with?: "+tt.startsWith(commonStr));
                    commonStr = smallW.substring(0,i);
                }
                else{
                    break;
                }

//                System.out.print("\n");
            }
        }

//        System.out.println("Common string is: "+commonStr);


        return commonStr;
    }

}

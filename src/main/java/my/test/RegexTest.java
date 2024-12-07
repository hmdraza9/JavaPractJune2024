package my.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RegexTest {
    public static void main(String[] args){
        removeSpRep("co#f@6org1e+ &cof^o!r9g{e");
    }

    public static void removeSpRep(String str){
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(cleaned);
        Set<String> noDups1 = Arrays.stream(cleaned.split("")).collect(Collectors.toSet());
        List<String> noDups2 = Arrays.stream(cleaned.split("")).distinct().collect(Collectors.toList());
        System.out.println("No Duplicates: "+noDups1);
        System.out.println("No Duplicates: "+noDups2);
    }
}
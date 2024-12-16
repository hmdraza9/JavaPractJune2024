package my.test;

import java.util.*;
import java.util.stream.Collectors;

public class RegexTest {
    public static void main(String[] args){
        removeSpRep("co#f@6org1e+ &cof^o!r9g{e");
        Integer[] numbs = {0,8,9,2,1,3,4,3,2,1,0,0,0,1,2,1,3};
        findDupNumbersStoreInOrderAsInInputList(numbs);
    }


    public static void removeSpRep(String str){
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(cleaned);
        Set<String> noDups1 = Arrays.stream(cleaned.split("")).collect(Collectors.toSet());
        List<String> noDups2 = Arrays.stream(cleaned.split("")).distinct().collect(Collectors.toList());
        System.out.println("No DuplicatesSet : "+noDups1);
        System.out.println("No DuplicatesLiat: "+noDups2);
    }

    public static void findDupNumbersStoreInOrderAsInInputList(Integer[] num){

        List<Integer> numList = Arrays.asList(num);
        List<Integer> filteredList = new ArrayList<>();
        Map<Integer, Integer> dupNum = new TreeMap<>();

        for(int a : numList){
            if(filteredList.contains(a)){
                dupNum.put(numList.indexOf(a), a);
            }
            else{
                filteredList.add(a);
            }
        }

        filteredList = new ArrayList<>(dupNum.values());
        System.out.println(filteredList);
    }
}
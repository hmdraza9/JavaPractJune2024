package pract.dec24.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams2 {

    //Given a list of lists, flatten it into a single list
    public static void taskOne(){
        List<List<Integer>> loloNumbers = Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6), Arrays.asList(7,8,9));
        List<Integer> flattenedList = loloNumbers.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println("Flattened list of numbers: "+flattenedList);
    }

    //Given a list of sentences, extract unique words
    public static void taskTwo(){
        List<String> sentences = Arrays.asList("Java is fun", "Java Streams are powerful", "Practice makes perfect");
        Set<String> uniqueWordsNoOrder = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).collect(Collectors.toSet());
        System.out.println("Unique words1: "+uniqueWordsNoOrder);
        List<String> uniqueWordsAsWas = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).distinct().collect(Collectors.toList());
        System.out.println("Unique words2: "+uniqueWordsAsWas);
    }

    //Given a list of numbers, find the sum of squares of even numbers
    public static void taskThree(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squareOfNums = numbers.stream().filter(num ->num%2==0).map(num -> num*num).collect(Collectors.toList());
        int sumOfSquareOfNums = numbers.stream().filter(num ->num%2==0).mapToInt(num -> num*num).sum();

        System.out.println("Sum of squares of numbers: "+sumOfSquareOfNums);
        System.out.println("Squares of numbers: "+squareOfNums);
    }

    //Given a list of numbers, find the product of all numbers greater than 5
    public static void taskFour(){
        List<Integer> numbers = Arrays.asList(2, 5, 7, 10, 3, 8);
        int sumOfMultiGreaterThan5 = numbers.stream().filter(num ->num>5).reduce(1, (a,b) -> a*b);
        System.out.println("Sum of squares of numbers>5: "+sumOfMultiGreaterThan5);
    }

    public static void wordCountStream(String str){
        List<String> wordList = Arrays.asList(str.split(" "));
        Map<String, Long> varWordCountStream = wordList.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println("varWordCountStream: "+varWordCountStream);
    }

    public static void wordCountMap(String str){


        List<String> words = Arrays.asList(str.split(" "));

        Map<String, Integer> wordsCount = new HashMap<>();

        for(int i=0;i<words.size();i++){
            if(wordsCount.containsKey(words.get(i))){
                wordsCount.put(words.get(i), wordsCount.get(words.get(i))+1);
            }
            else{
                wordsCount.put(words.get(i), 1);
            }
        }
    }

//    public static void makeWordNumMapOneChar(String code, String expString){
//
//
//        StringBuilder finalString = new StringBuilder();
//        while(code.length()>1){
//
//            String targetStr = code.substring(0,1);
//            int count = Integer.parseInt(code.substring(1,2));
//
//            for(int i=0;i<count;i++){
//                finalString.append(targetStr);// a aa aaa
//            }
//
//            code = code.substring(2);
//
//        }
//
//        System.out.println("finalString: "+finalString);
//        System.out.println(expString.contentEquals(finalString));
//    }

//    public static void makeWordNumMapMultipleChar(String code, String expString){
//        StringBuilder codeSnip = new StringBuilder();
//        StringBuilder countSnip = new StringBuilder();
//        for(String c : code.split("")) {
//            if (Character.isDigit(c.charAt(0))) {
//                countSnip.append(c).append(",");
//                codeSnip.append(" ");
//            } else {
//                codeSnip.append(c);
//            }
//        }
//        codeSnip = new StringBuilder(codeSnip.toString().trim()); //a s d f
//        countSnip = new StringBuilder(countSnip.toString().trim().replaceAll(","," ").trim()); //1,2,3,4 -> 1 2 3 4 -> 1 2 3 4
//
//        String[] regCode = codeSnip.toString().split(" ");
//        String[] regCount = countSnip.toString().split(" ");
//
//        StringBuilder finalCode = new StringBuilder();
//        int i = 0;
//        while(i<regCode.length){
//            for(int j=0;j<Integer.parseInt(regCount[i]);j++){
//                finalCode.append(regCode[i]);
//            }
//            i++;
//        }
//        System.out.println(finalCode.toString().contentEquals(expString));
//        System.out.println("finalCode: "+finalCode);
//        System.out.println("expString: "+expString);
//    }
}

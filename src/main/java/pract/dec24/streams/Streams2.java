package pract.dec24.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
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
}

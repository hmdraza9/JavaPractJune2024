package pract.dec24.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams2 {

    // Flattens a nested list of integers into a single list
    public static void flattenNestedList() {
        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flattenedList = nestedNumbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened list of numbers: " + flattenedList);
    }

    // Extracts unique words from a list of sentences
    public static void extractUniqueWords() {
        List<String> sentences = Arrays.asList("Java is fun", "Java Streams are powerful", "Practice makes perfect");
        Set<String> uniqueWordsSet = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toSet());
        System.out.println("Unique words (unordered): " + uniqueWordsSet);

        List<String> uniqueWordsList = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique words (ordered): " + uniqueWordsList);
    }

    // Calculates the sum of squares of even numbers from a list
    public static void calculateSumOfSquaresOfEvens() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sumOfSquares = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num * num)
                .sum();

        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }

    // Calculates the product of all numbers greater than 5 in a list
    public static void calculateProductOfNumbersGreaterThan5() {
        List<Integer> numbers = Arrays.asList(2, 5, 7, 10, 3, 8);
        int product = numbers.stream()
                .filter(num -> num > 5)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product of numbers > 5: " + product);
    }

    // Counts the occurrences of each word in a string using streams
    public static void wordCountUsingStreams(String str) {
        List<String> wordList = Arrays.asList(str.split(" "));
        Map<String, Long> wordCount = wordList.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println("Word count using streams: " + wordCount);
    }

    // Counts the occurrences of each word in a string using a map
    public static void wordCountUsingMap(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word count using map: " + wordCount);
    }

    // Decodes a string with single-character codes and counts (e.g., "a1b2")
    public static void decodeSingleCharCount(String code, String expected) {
        StringBuilder decodedString = new StringBuilder();
        while (code.length() > 1) {
            String character = code.substring(0, 1);
            int count = Integer.parseInt(code.substring(1, 2));

            decodedString.append(character.repeat(count));
            code = code.substring(2);
        }

        System.out.println("Decoded string: " + decodedString);
        System.out.println("Matches expected: " + expected.contentEquals(decodedString));
    }

    // Decodes a string with multi-character codes and counts (e.g., "a1b2c3")
    public static void decodeMultiCharCount(String code, String expected) {
        StringBuilder characters = new StringBuilder();
        StringBuilder counts = new StringBuilder();

        for (String c : code.split("")) {
            if (Character.isDigit(c.charAt(0))) {
                counts.append(c).append(",");
                characters.append(" ");
            } else {
                characters.append(c);
            }
        }

        String[] charArray = characters.toString().trim().split(" ");
        String[] countArray = counts.toString().trim().replaceAll(",", " ").trim().split(" ");

        StringBuilder decodedString = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            decodedString.append(charArray[i].repeat(Integer.parseInt(countArray[i])));
        }

        System.out.println("Decoded string: " + decodedString);
        System.out.println("Matches expected: " + expected.contentEquals(decodedString));
    }
}

package pract.dec24.streams;


import pract.deec24.streams.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams1 {
    // Filters names starting with the given prefix
    public static void filterNamesStartingWith(String startsWith) {
        List<String> studNames = Arrays.asList("Alice", "Bob", "Charlie", "Andrew", "David");
        List<String> filteredNames = studNames.stream()
                .filter(name -> name.startsWith(startsWith))
                .collect(Collectors.toList());
        System.out.println("Names starting with '" + startsWith + "': " + filteredNames);
    }

    // Finds the top 3 numbers in descending order
    public static void findTop3Descending() {
        List<Integer> nums = Arrays.asList(15, 42, 8, 23, 4, 16);
        List<Integer> top3Nums = nums.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top 3 numbers: " + top3Nums);
    }

    // Finds the sum of numbers divisible by a given divisor
    public static void findSumOfDivisibles(int divisor) {
        List<Integer> nums = Arrays.asList(10, 15, 8, 23, 16, 87);
        int condSum = nums.stream()
                .filter(i -> i % divisor == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Conditional sum (divisor=" + divisor + "): " + condSum);
    }

    // Groups names by their starting letter
    public static void groupNamesByStartingLetter() {
        List<String> studNames = Arrays.asList("Alice", "Albert", "Bob", "Charlie", "Andrew", "David", "Danice");
        Map<Character, List<String>> groupedNames = studNames.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("Grouped names: " + groupedNames);
    }

    // Filters names with length > 3 and converts to lowercase
    public static void filterAndLowercaseLongNames() {
        List<String> studNames = Arrays.asList("Alice", "Albert", "Bob", "Charlie", "Andrew", "David", "Danice");
        List<String> longNames = studNames.stream()
                .filter(name -> name.length() > 3)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Long names: " + longNames);
    }

    // Filters numbers > 10 and converts them to strings
    public static void filterAndConvertToStrings() {
        List<Integer> numbers = Arrays.asList(5, 12, 3, 18, 8, 14);
        List<String> numAsStrings = numbers.stream()
                .filter(num -> num > 10)
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println("Numbers > 10 as strings: " + numAsStrings);
    }

    // Sorts names alphabetically and selects the top 2
    public static void sortAndPickTop2Names() {
        List<String> names = Arrays.asList("Alice", "Albert", "Bob", "Charlie", "Andrew", "David", "Danice");
        List<String> top2Names = names.stream()
                .sorted(Comparator.naturalOrder())
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("Top 2 names: " + top2Names);
    }

    // Sorts numbers ascending, skips first 3, and picks the next 3
    public static void sortAndSkipFirst3() {
        List<Integer> nums = Arrays.asList(10, 5, 3, 8, 12, 7);
        List<Integer> skippedNums = nums.stream()
                .sorted(Comparator.naturalOrder())
                .skip(3)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Numbers after skipping 3: " + skippedNums);
    }

    // Finds the maximum value in a list
    public static void findMaxValue() {
        List<Integer> nums = Arrays.asList(10, 5, 3, 8, 12, 12, 7);
        nums.stream().max(Integer::compareTo).ifPresent(max -> System.out.println("Max value: " + max));
    }

    // Finds the average of even numbers
    public static void findAverageOfEvenNumbers() {
        List<Integer> nums = Arrays.asList(10, 5, 3, 8, 12, 12, 7);
        nums.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(avg -> System.out.println("Average of even numbers: " + avg));
    }

    // Groups employees by their department
    public static void groupEmployeesByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Adam", "Sales"),
                new Employee("Dannis", "Legal"),
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "IT"),
                new Employee("David", "HR"),
                new Employee("Eve", "Finance")
        );
        Map<String, List<Employee>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Grouped by department: " + groupedByDept);
    }
}

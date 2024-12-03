package pract.dec24.streams;


import pract.deec24.streams.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams1 {
    // ********Intro********
    //from a collection
    List<String> names = Arrays.asList("Alice","Bob","Charlie");
    Stream<String> nameStream = names.stream();

    //from an array
    String[] nameArray = {"Alice","Bob","Charlie"};
    Stream<String> stramFromArray = Arrays.stream(nameArray);

    //Using Stream.of
    Stream<String> usingStream = Stream.of("Alice","Bob","Charlie");

    //using Stream.generate
    Stream<Double> usingStreamGenerate = Stream.generate(Math::random).limit(5);


    //Given a list of names, filter out names starting with "A", convert the remaining names to uppercase, and collect them into a list.
    public static void taskOne(String startsWith){
        List<String> studNames = Arrays.asList("Alice","Bob","Charlie","Andrew","David");
        List<String> filterednames = studNames.stream().filter(name -> name.startsWith(startsWith)).collect(Collectors.toList());
        System.out.println("Names starts with '"+startsWith+"' : "+filterednames);
    }

    //Sort a list of integers in descending order and find the top 3 values
    public static void taskTwo(){
        List<Integer> nums = Arrays.asList(15,42,8,23,4,16);

        List<Integer> top3Nums = nums.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("Top 3 numbers: "+top3Nums);
    }

    //Find the sum of all even numbers in a list
    public static void taskThree(int divi){
        List<Integer> nums = Arrays.asList(10, 15, 8, 23, 16, 87);

        int condSum = nums.stream().filter(i -> i%divi==0).mapToInt(Integer::intValue).sum();
        System.out.println("Conditional sum of eligible elements (divi="+divi+"): "+condSum);
    }

    //Group a list of names by their starting letter
    public static void taskFour(){
        List<String> studNames = Arrays.asList("Alice","Albert","Bob","Charlie","Andrew","David", "Danice");
        Map<Character, List<String>> groupedName = studNames.stream().collect(Collectors.groupingBy(name ->name.charAt(0)));
        System.out.println("Name grouping: "+groupedName);
    }

    //Scenario 1.1: Given a list of names, filter out names with length greater than 3 and convert them to lowercase.
    public static void taskOneOne(){
        List<String> studNames = Arrays.asList("Alice","Albert","Bob","Charlie","Andrew","David", "Danice");
        List<String> longNames = studNames
        .stream()
        .filter(name ->name.length()>3)
        .map(String::toLowerCase)
        .collect(Collectors.toList());

        System.out.println("Long names: "+longNames);
    }

    //Given a list of numbers, filter out numbers greater than 10 and convert them to string format.
    public static void taskOneTwo(){
        List<Integer> numbers = Arrays.asList(5, 12, 3, 18, 8, 14);
        List<String> numAsString = numbers.stream().filter(num -> num>10).map(String::valueOf).collect(Collectors.toList());
        System.out.println("Number greater than 10 as Strings: "+numAsString);
    }

    //Sort a list of names in alphabetical order and take the first 2 names.
    public static void taskOneThree(){
        List<String> names = Arrays.asList("Alice","Albert","Bob","Charlie","Andrew","David", "Danice");
        List<String> top2NameOrdered = names.stream().sorted(Comparator.naturalOrder()).limit(2).collect(Collectors.toList());
        System.out.println("Top two names, ordered: "+top2NameOrdered);
    }

    //Given a list of numbers, sort them in ascending order and skip the first 3 numbers..
    public static void taskOneFour(){
        List<Integer> nums = Arrays.asList(10, 5, 3, 8, 12, 7);
        List<Integer> top3NNumsOrdered = nums.stream().sorted(Comparator.naturalOrder()).skip(3).limit(3).collect(Collectors.toList());
        System.out.println("Top two names, ordered: "+ top3NNumsOrdered);
    }

    //Find the Maximum Value from a List
    public static void taskOneFive(){
        List<Integer> nums = Arrays.asList(10, 5, 3, 8, 12, 12, 7);
        Optional<Integer> maxNum = nums.stream().max(Integer::compareTo);
        maxNum.ifPresent(System.out::println);
    }

    //Given a list of numbers, find the average of even numbers
    public static void taskOneSix(){
        List<Integer> nums = Arrays.asList(10, 5, 3, 8, 12, 12, 7);
        OptionalDouble avgEvenNums = nums.stream().filter(num -> num%2==0).mapToInt(Integer::intValue).average();
        avgEvenNums.ifPresent(System.out::println);
    }

    //Given a list of employee names and their departments, group employees by their department
    public static void taskOneSeven(){

        List<Employee> employees = Arrays.asList(
                new Employee("Adam", "Sales"),
                new Employee("Dannis", "Legal"),
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "IT"),
                new Employee("David", "HR"),
                new Employee("Eve", "Finance"));

        Map<String, List<Employee>> groupedByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(groupedByDepartment);
    }

}

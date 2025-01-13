package test.com;

import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseOfStreamWithListOfIntegers {

    private static Map<String, Long> map;

    public static void main(String[] args){

        stringCountRepsStream();
        mapToJSON();
        twoListUniqueEvenWithStream();

    }

    public static void stringCountRepsStream(){
        String str = "1,3,46,78,9,0,3,45,67,1,1,2,1,56,78,9,9,9,3,3,46,0,0";

        List<String> numbers = Arrays.asList(str.split(","));

        Map<String, Long> reps = numbers.stream().collect(Collectors.groupingBy(string -> string, Collectors.counting()));

        System.out.println(reps);

        map = reps;
    }

    private static void twoListUniqueEvenWithStream(){
        List<Integer> list1 = Arrays.asList(1,2,34,1,2,1);
        List<Integer> list2 = Arrays.asList(3,4,5,9,6,9,7,8);

        List<Integer> finalList = Stream.of(list1, list2)
                .flatMap(List::stream)
                .filter(num -> num % 2 == 0)
                .distinct()
                .sorted()
                .toList();

        System.out.println("finalList: "+finalList);
    }

    private static void mapToJSON(){
        JSONObject jsonObject = new JSONObject(map);
        System.out.println(jsonObject);
    }

}

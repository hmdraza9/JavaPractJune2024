package test.com;

import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestH {

    private static Map<String, Long> map;

    public static void main(String[] args){

        stringCountRepsStream();
        mapToJSON();

    }

    public static void stringCountRepsStream(){
        String str = "1,3,46,78,9,0,3,45,67,1,1,2,1,56,78,9,9,9,3,3,46,0,0";

        List<String> numbers = Arrays.asList(str.split(","));

        Map<String, Long> reps = numbers.stream().collect(Collectors.groupingBy(string -> string, Collectors.counting()));

        System.out.println(reps);

        map = reps;
    }

    private static void mapToJSON(){
        JSONObject jsonObject = new JSONObject(map);
        System.out.println(jsonObject);
    }

}

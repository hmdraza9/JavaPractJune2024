package pract.dec24.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams3 {

    public static final String str = "qywetwqet12321jhagdfjsd8979475jh093490238023jsadgajgsd90210839021380jkdshfdkjh0-4593-95674dfugodit-0569897ljkgfl723138623hGASFHGAfsg06978968967;G,;FLJsdOSADOASDJAS309482402390olsueroiewurowue";


    public static void charCountStreamNew(){

        Map<String, Long> charCountStream = Arrays.stream(str.split("")).collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println("charCountStream: "+charCountStream);

        System.out.println("Str        : "+Arrays.toString(str.split("")));
        System.out.println("Str \\\\d     : "+Arrays.toString(str.split("\\d")));
        System.out.println("Str \\\\d+    : "+Arrays.toString(str.split("\\d+")));
        System.out.println("Str \\\\D     : "+Arrays.toString(str.split("\\D")));
        System.out.println("Str \\\\D+    : "+Arrays.toString(str.split("\\D+")));
        System.out.println("Str [\\\\d\\\\W] : "+Arrays.toString(str.split("[\\d\\W]")));

    }

    public static void sumAllNum(){

        String[] onlyNumbers = str.split("\\D+");

        long sum = Arrays.stream(onlyNumbers).filter(number -> !number.isEmpty()).mapToLong(Long::parseLong).sum();

        System.out.println("Sum: "+sum);
    }
}

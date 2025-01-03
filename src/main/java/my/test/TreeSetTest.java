package my.test;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,2,0,4,5,4);

        Set<Integer> numSet = new TreeSet<>(numList);

        List<Integer> sortedNum = new ArrayList<>(numSet);

        sortedNum.sort(Comparator.reverseOrder());

        System.out.println(sortedNum);

    }
}

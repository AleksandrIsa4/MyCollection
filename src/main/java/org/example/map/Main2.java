package org.example.map;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        Object[] objs = new Object[]{1, 2, 3.0, 4.0, "5", "6",1, 2, 3.0, 4.0, 3.0, 4.0, "5", "6"};
        Integer[] ints = new Integer[]{1, 2, 3, 4, 5, 6,1,1,1,2,2,3};
        String[] strs = new String[]{"1", "2", "3", "4", "5", "6","1", "1", "3", "5", "5", "1"};
        Double[] doubs = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0,1.0, 2.0, 3.0, 6.0,1.0, 6.0,1.0};
        Map<? extends Object,? extends Number> mapObjs = countOfElements(objs);
        Map<? extends Object,? extends Number> mapInts = countOfElements(ints);
        Map<? extends Object,? extends Number> mapStrs = countOfElements(strs);
        Map<? extends Object,? extends Number> mapDoubs = countOfElements(doubs);
        System.out.println(mapObjs.toString());
        System.out.println(mapInts.toString());
        System.out.println(mapStrs.toString());
        System.out.println(mapDoubs.toString());
    }

    private static <T> Map<T,Long> countOfElements(T[] ts) {
        Map<T, Long> result = Arrays.stream(ts).collect(Collectors.groupingBy(t -> t,Collectors.counting()));
        return result;
    }
}
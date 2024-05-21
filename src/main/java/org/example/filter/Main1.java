package org.example.filter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Filter filter = new FilterImpl();
        Object[] objs = new Object[]{1, 2, 3.0, 4.0, "5", "6"};
        Integer[] ints = new Integer[]{1, 2, 3, 4, 5, 6};
        String[] strs = new String[]{"1", "2", "3", "4", "5", "6"};
        Double[] doubs = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        objs = filter(objs, filter);
        ints = filter(ints, filter);
        strs = filter(strs, filter);
        doubs = filter(doubs, filter);
        System.out.println(Arrays.toString(objs));
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.toString(doubs));
    }

    private static <T> T[] filter(T[] t, Filter filter) {
        T[] result= (T[]) Array.newInstance(t.getClass().getComponentType(),t.length );
        for (int i = 0; i < t.length; i++) {
            result[i] = (T) filter.apply(t[i]);
        }
        return result;
    }
}
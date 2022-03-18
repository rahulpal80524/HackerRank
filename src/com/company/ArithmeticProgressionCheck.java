package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class ArithmeticProgressionCheck {
    public static void main(String[] args) {
        int[] arr ={3,5,1};
//        System.out.println(canMakeArithmeticProgression(arr));
        

    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
//         Arrays.asList(arr);
//        List<int[]> list = Arrays.asList(arr);
       IntStream arr1 =  Arrays.stream(arr).sorted();
        for (int item:arr
             ) {
            System.out.println(item);

        }

    return true;
    }

}

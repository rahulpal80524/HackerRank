package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SalesbyMatch {
    public static void main(String[] args) {

        List<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

//        10 20 20 10 10 30 50 10 20
        System.out.println( sockMerchant(9,ar));

    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
//        Collections.sort(ar);
        System.out.println( ar.contains(ar.get(0)));

        return 3;

    }
}

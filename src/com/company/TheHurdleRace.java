package com.company;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheHurdleRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        List<Integer> height = new ArrayList<Integer>();
        height.add(1);
        height.add(6);
        height.add(3);
        height.add(5);
        height.add(2);
        System.out.println(hurdleRace(k,height));


    }
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int Max= height.get(0);
        for (int i=1;i<height.size();i++){
            if (Max<=height.get(i)){
                System.out.println(height.get(i));
                Max=height.get(i);
            }

        }
        if (k<Max){
            return Max-k;
        }else {
            return 0;
        }

    }
}

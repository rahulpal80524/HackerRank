package com.company;

public class CountingValleys {
    public static void main(String[] args) {
               String s="UDUUUDUDDD";
               int p = 10;
        System.out.println(countingValleys(p,s));
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int represent=0,up=0;
       for (int i=0;i<steps;i++){
           char case1=path.charAt(i);

           if (case1=='U'){

               represent++;
               System.out.println("U "+represent);
               if (represent>=0){
                   up++;
               }
           }else {

               represent--;
               System.out.println("D "+represent);
           }
       }

    return up-1;
    }
}

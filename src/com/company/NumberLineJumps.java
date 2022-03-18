package com.company;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(0,2,5,3));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int i=1,kangaroo1=x1,kangaroo2=x2;
        while (i>0){
            kangaroo1+=v1;
            kangaroo2+=v2;
            if (kangaroo1==kangaroo2){
                return "YES";
            }else if(i==10){
                return "NO";
            }
            i++;
        }
      return "NO";
    }
}

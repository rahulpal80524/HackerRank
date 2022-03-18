package com.company;

public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(5));
    }

    public static int utopianTree(int n) {
        // Write your code here
        int height =1;
        for (int i=0;i<=n;i++){
            if(i==0){
                if (i==n)
                return height;
            }else if (i%2!=0){
                height = height*2;
                if (i==n)
                return height;
            }else{
                height=height+1;
                if (i==n)
                return height;
            }
        }
    return height;
    }
}

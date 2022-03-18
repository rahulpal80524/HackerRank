package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] salary ={4000,3000,1000,2000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        int min=salary[0],max=salary[0];
        double sum=0;
        for(int i=1;i<salary.length;i++){
            if(min>salary[i]){
                min=salary[i];
            }if(max<salary[i]){
                max=salary[i];
            }
        }
        for (int i=0;i<salary.length;i++){
             sum+=salary[i];
        }
       return  (sum-(min+max))/(salary.length-2);

    }
}

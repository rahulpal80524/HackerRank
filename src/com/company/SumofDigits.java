package com.company;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }


    public static int subtractProductAndSum(int n) {
//        int sum = 0, product = 1, n1 = 5,i=1;
//        while (n1>=0) {
//            System.out.println("N "+n);
//            sum += n % (10 * i);
//            System.out.println("sum "+sum);
//            product *= n % (10 * i);
//            System.out.println("pro "+product);
//            i*=10;
//          n1--;
//        }
//    return 3;
        int sum=0,product=1;
        String n1 = String.valueOf(n);
        for (int i=0;i<n1.length();i++){
            String s1= String.valueOf(n1.charAt(i));
            sum+=Integer.parseInt(s1);
            product*=Integer.parseInt(s1);

        }
     return (product-sum);
    }

}

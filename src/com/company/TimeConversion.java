package com.company;

import java.io.*;

public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here

        if(s.contains("AM")){
            if (s.contains("12")){
                String s1=s.replace("12","00");
                return s1.replace("AM","");
            }
            return s.replace("AM","");
        }else{
           if (s.contains("12")&&s.contains("PM")){

               return s.replace("PM","");

           }else {
               String[] time = s.split(":",2);
               String t  = time[0];
               int time1 = Integer.parseInt(time[0])+12;
               String s1 = String.valueOf(time1);
               String s2=s.replace(t,s1);
               return s2.replace("PM","");
           }
        }
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String s = bufferedReader.readLine();
        String s ="07:05:45PM";
        String result = TimeConversion.timeConversion(s);
        System.out.println(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

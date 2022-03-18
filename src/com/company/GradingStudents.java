package com.company;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {


        List<Integer> grades = new ArrayList<Integer>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        List<Integer> grades1= gradingStudents(grades);
        for (int item:grades1
             ) {
            System.out.println(item);

        }

    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for (int i=0;i<grades.size();i++) {
            int num = grades.get(i);
            if (grades.get(i)>37){

                if (((grades.get(i)+1)%5 )== 0) {
                    grades.set(i, num + 1);

                }else if(((grades.get(i)+2)%5)== 0){
                    grades.set(i, num+2);
                }
            }
        }
        return grades;
    }
}

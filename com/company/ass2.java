package com.company;
import java.util.Scanner;
public class ass2 {
    public static void main(String[] args) {
        //ass1
        // float a = 7/4f*9/2f;
        // System.out.println(a);
        //ass2
        // char grade = 'A';
        // System.out.println("value "+grade);
        // grade=(char) (grade +8);
        // System.out.println("after encrypt "+grade);
        // grade=(char) (grade - 8);
        // System.out.println("after decrypt "+grade);  
        //ass3
       Scanner s = new Scanner(System.in);
       System.out.println("enter the value of a and b: ");
       int a = s.nextInt();
       int b = s.nextInt();
       System.out.println("a is greater than b :  " + (a>b));
    }
}

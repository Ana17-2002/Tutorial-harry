package com.company;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("enter the  num:");
        Scanner s = new Scanner(System.in);
        System.out.println("enter the num 1");
        int num1 = s.nextInt();
        System.out.println("enter the value of num 2");
        int num2 = s.nextInt();
        int a =num1 + num2;
        System.out.println(a);
        boolean b = s.hasNextBoolean();
        System.out.println(b);
    }
}

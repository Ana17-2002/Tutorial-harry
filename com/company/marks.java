package com.company;
import java.util.Scanner;
public class marks {

    public static void main(String[] args) {
        System.out.println("Enter the numbers :");
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of a :  ");
        float a = s.nextFloat();
        System.out.println("enter the value of b :  ");
        float b = s.nextFloat();
        System.out.println("enter the value of c :  ");
        float c = s.nextFloat();
        System.out.println("enter the value of d :  ");
        float d = s.nextFloat();
        System.out.println("enter the value of e :  ");
        float e = s.nextFloat();
        float sum = ((a+b+c+d+e)/500)*100;
        System.out.println("the value of the marks are : ");
        System.out.print(sum);
    }
}

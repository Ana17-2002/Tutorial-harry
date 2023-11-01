package com.company;
import java.util.Scanner;
public class stringass {
    public static void main(String[] args) {
        //problem 1 
        String a = "Anamitra";
        a = a.toLowerCase();
        System.out.println("converting to lower case "+a);
        //problem 2
        String b = " Anamitra Kumar Sengupta ";
        b = b.replace(' ', '_');
        System.out.println("solve of problem 2 "+ b);
        //problem 3
       String c = "anamitra   Sengupta";
       System.out.println(c.indexOf("    "));
       // if the value is - 1 then the above string is not present 
       //problem 5 

    }
}

package com.company;

public class trim {
   public static void main(String[] args) {
   //  String nottrim ="     Anamitra      ";
   //  System.out.println(nottrim);
   //  System.out.println(nottrim.trim());
    String a = "Anamitra";
    System.out.println(a.substring(1));
    System.out.println(a.substring(2, 6));
    System.out.println(a.replace('a','A'));
    System.out.println(a.replace("tra","ka"));
    System.out.println(a.startsWith("Ana"));
    System.out.println(a.endsWith("tra"));
    System.out.println(a.indexOf("nam"));
    System.out.println(a.indexOf("a",3));
    System.out.println(a.equals("Anamitra"));
    System.out.println(a.equalsIgnoreCase("aNAMITRA"));
    System.out.println("i am escape \\  sequence");
   } 
}

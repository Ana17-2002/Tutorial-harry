package com.company;
import java.util.Scanner;
public class condiass {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //problem 1
    // System.out.print("enter the value of a:  ");
    // int a = sc.nextInt();
    // if (a==11) {
    //     System.out.println("he is 11");
    // } else {
    //     System.out.println("he is not 11");
    // }
    //problem 2
    // 
    //problem3 
    // float income;
    // System.out.println("enter the income : ");
    // income=sc.nextFloat();
    // if ((income>=2.5f)&&(income<=5f)) {
    //     System.out.println((income*100000f)*(5/100f));}
    // else if ((income>=5f)&&(income<=10f)) {
    //     System.out.println("The tax will be : "+((income*100000f)*(10/100f))+ "rupees");
    // }  
    // else if((income>=10f)){
    //     System.out.println("The tax will be : "+((income*100000f)*(20/100f))+ "rupees");
    // }  
    // else{
    //     System.out.println("don't have to give any tax");
    // }
//problem4
System.out.print("enter the day no.   : ");
int d = sc.nextInt();
switch (d) {
    case 1->{
        System.out.println("it is fucking  sunday bouis");
    }
    case 2->{
        System.out.println("Monday");
    }
    case 3->{
        System.out.println("Tuesday");
    }
    case 4->{
        System.out.println("wed");
    }
    case 5->{
        System.out.println("Thursday");}
    case 6->{
        System.out.println("Fryday");}
    case 7->{
        System.out.println("Saturday");
    }
}
    }
}

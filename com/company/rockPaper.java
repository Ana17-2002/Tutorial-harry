package com.company;
import java.util.Scanner;
import java.util.Random;

public class rockPaper {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("you have 3 choices \n 1->Rock\n 2->Paper\n 3->scissor");
     int user_choice = sc.nextInt();
     if (user_choice==1) {
        System.out.println("you choosed Rock");
     } else if (user_choice==2) {
        System.out.println("you choosed Paper");
     } 
     else if (user_choice==3) {
        System.out.println("you choosed Scissor");
     } else {
        System.out.println("Invalid input");
     }
     Random r = new Random();
     int computers_choice=r.nextInt(1,4);
if (computers_choice==1) {
    System.out.println("mechine choosed Rock");
} if (computers_choice==2) {
    System.out.println("mechine chossed Paper ");
} else if (computers_choice==3) {
    System.out.println("mechine choosed Scissor ");
} else {
    System.out.println("some problem happend");
}
System.out.println("result");
   if (user_choice==computers_choice) {
    System.out.println("draw");
   } else if ((user_choice==1)&&(computers_choice==3)) {
    System.out.println("you won");
   } else if ((user_choice==3)&&(computers_choice==1)) {
    System.out.println("mechine won");
   } else if ((user_choice==2)&&(computers_choice==1)) {
    System.out.println("you won");
   } else if ((user_choice==1)&&(computers_choice==2)) {
    System.out.println("mechine won");
   } else if ((user_choice==3)&&(computers_choice==1)) {
     System.out.println("mechine won");
   } else {
    System.out.println("You won");
   }
}
}

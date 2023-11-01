package com.company;

import java.util.Scanner;
import java.util.Random;

class game {
    private int computerNumber;
    private int UserInput;
    private int NumberOfGuesses = 0;
    Random rn = new Random();

    public game() {
        computerNumber = rn.nextInt(101);
    }

    public void UserInput(int a) {
        UserInput = a;
    }
    public int IsCorrect(){
        if (computerNumber==UserInput) {
            return 0;
        } else if (UserInput>computerNumber) {
            return 1;
        } else {
            return -1;
        }
    }
    public void setcounter(){
NumberOfGuesses ++;
    }
    public void getcounter(){
        System.out.println("the number of attempts are :  "+ NumberOfGuesses);
    }
}

public class cwh_43_guessTheNum {
public static void main(String[] args) {
    game obj=new game();
    Scanner sc=new Scanner(System.in);
    System.out.println("Starting the game best of luck ");
    while (true) {
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        obj.UserInput(n);
        if (obj.IsCorrect()==0) {
            obj.setcounter();
            System.out.println("the number is correct");
            obj.getcounter();
         break;}
         else if (obj.IsCorrect()==1){
            obj.setcounter();
            System.out.println("the number is lesser");
         } else if (obj.IsCorrect()==-1) {
            obj.setcounter();
            System.out.println("the number is bigger ");
         } 
    }

}
}

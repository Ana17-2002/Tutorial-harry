package com.company;

import java.util.Scanner;

public class cwh_34_recursion {
    static int humsakal(int n) {
        if (n <= 1)
            return n;

        // Recursive call
        return humsakal(n - 1)
                + humsakal(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the turm number");
        int a = sc.nextInt();
        System.out.println("the ans is : " + humsakal(a));
    }
}

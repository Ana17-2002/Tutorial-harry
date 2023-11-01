package com.company;

import java.util.Scanner;

public class cwh_25 {
    public static void main(String[] args) {
        // int n=5;
        // for (int i=n;i<n;i--) {
        // for (int j =1;j<i;j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= n) {
            sum = sum + 2 * i;
            i++;
        }
        System.out.println(sum);
    }
}

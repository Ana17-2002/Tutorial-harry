//package com.company;

public class cwh_35_ass {
    static void table(int n) {
        System.out.println("the table is ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    static int sum(int n) {
        int result = 0;
        if (n == 1) {
            return n;
        }
        result = n + sum(n - 1);
        return result;
    }

    static void pat(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pati(int n) {
        if (n > 0) {
            pati(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int a = 7;
        // System.out.println(" ans"+ sum(a));
        // pat(a);
        pati(a);
        pat(a);

    }
}

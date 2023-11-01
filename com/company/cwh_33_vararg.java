//package com.company;

public class cwh_33_vararg {
    static int sum(int... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    static int ana(int a, int... alfa) {
        int result=a;
        for (int i : alfa) {
            result+=i;
        }
        return result;
    }

    public static void main(String[] args) {
    
        System.out.println("entered num :  "+ana(2, 6, 7, 8, 9, 45));
    }
}

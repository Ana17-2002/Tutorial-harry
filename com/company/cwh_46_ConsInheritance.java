package com.company;

class dadu1 {
    dadu1() {
        System.out.println("apun sabka dadu hain ");
    }

    dadu1(int a) {
        System.out.println(" over loaded constructor which prints a integer " + a);
    }
}

class baba1 extends dadu1 {
    baba1() {
        System.out.println("apun sabka bap hain ");
    }

    baba1(int a, int b) {
        super(a);
        System.out.println("i am an overloaded constructor which is derived with the value of b" + b);
    }
}

class chele1 extends baba1 {
    chele1() {
        System.out.println("apun sabse chota hain ");
    }

    chele1(int a, int b, int c) {
        super(a, b);
        System.out.println("i am an overloaded constructor derived with the value c " + c);
    }
}

public class cwh_46_ConsInheritance {
    public static void main(String[] args) {
        chele1 as = new chele1();
        chele1 af = new chele1(12, 23, 56);
    }
}

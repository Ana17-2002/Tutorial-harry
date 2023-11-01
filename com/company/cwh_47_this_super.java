package com.company;

class ekclass {
    int a;

    public ekclass(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

}

class doclass extends ekclass {
    doclass(int c) {
        super(c);
        System.out.println("child of ekclass");
    }
}

public class cwh_47_this_super {
    public static void main(String[] args) {
        ekclass alfa = new ekclass(23);
        System.out.println("this value of a is given to the constructor : " + alfa.getA());
        doclass beta = new doclass(45);
        System.out.println(beta.getA());

    }
}

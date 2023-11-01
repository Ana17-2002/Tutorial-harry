package com.company;

class base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base and seting the value of x");
        this.x = x;

    }
}

class derived extends base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("");
        this.y = y;
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        base bull = new base();
        bull.setX(56);
        System.out.println("the value of x in base" + bull.getX());
        derived anna=new derived();
        anna.setX(45);
        System.out.println("the value of x in derived"+anna.getX());
        

    }
}

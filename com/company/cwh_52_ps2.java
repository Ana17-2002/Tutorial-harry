package com.company;
import java.util.*;
class Rect12{
    public int length;
    public int breadth;
    // public int getLength() {
    //     return length;
    // }
    // public void setLength(int l) {
    //     this.length = l;
    // }
    // public int getBreadth() {
    //     return breadth;
    // }
    // public void setBreadth(int b) {
    //     this.breadth = b;
    // }
    public Rect12(int l, int b) {
        this.length = l;
        this.breadth = b;
    }
    public double area(int l,int b){
        return l*b;
    }

}
class Cuboid12 extends Rect12{
    public int height;

    // public int getHeight() {
    //     return height;
    // }

    // public void setHeight(int h) {
    //     this.height = h;
    // }

    public Cuboid12(int l, int b, int h) {
        super(l, b);
        this.height = h;
    }
    public double volume(int l , int b, int h){
    return l*b*h;}
}
public class cwh_52_ps2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of the length, breadth, height :  ");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Cuboid12 cube = new Cuboid12(a, b, c);
        
        System.out.println("the value of the volume of the cuboid is  : "+cube.volume(a, b, c));
    }
}

package com.company;

import java.util.Scanner;
import java.lang.Math;

class cylinder {
    // private int H;
    // private int R;

    // public void SetH(int a) {
    //     H = a;
    // }

    // public void SetR(int b) {
    //     R = b;
    // }

    // public int GetR() {
    //     return R;
    // }

    // public int GetH() {
    //     return H;
    // }

    // public void AreaCylinder() {
    //     System.out.println("The area of the cylinder is :  " + (2 * (Math.PI * R * R) + 2 * (Math.PI * R * H)));
    // }

    // public void VolumeCylinder() {
    //     System.out.println("The volume of the cylinder is :  " + (Math.PI * R * R * H));
    // }
    cylinder(int h,int r){
        System.out.println("the hight of the cylinder is : " + h);
        System.out.println("the radius of the cylinder is :  "+ r);
        System.out.println("The volume of the cylinder is :  " + (Math.PI * r * r * h));
        System.out.println("The area of the cylinder is :  " + (2 * (Math.PI * r * r) + 2 * (Math.PI * r * h)));
    }
}

public class cwh_44_practiceset {
    public static void main(String[] args) {
        System.out.println("enter the value of a and b for H and R :  ");
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        cylinder dim = new cylinder(a,b);
       // Scanner sc = new Scanner(System.in);

        // dim.SetH(a);
        // dim.SetR(b);
        // dim.VolumeCylinder();
        // dim.AreaCylinder();

    }
}

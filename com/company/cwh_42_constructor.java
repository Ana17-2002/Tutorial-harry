package com.company;
class mycom{
    mycom(int a,int b,String c){
        System.out.println("my employee id is :   "+a);
        System.out.println("my name is :  "+c);
        System.out.println("my salary is : "+b);
    }
    public class cwh_42_constructor{
        public static void main(String[] args) {
            mycom anna=new mycom(19, 300000, "Anamitra sengupta");

        }
    }
}
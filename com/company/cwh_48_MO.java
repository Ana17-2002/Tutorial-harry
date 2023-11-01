//package com.company;
class A{
    public void meth1(){
        System.out.println(" i am meth 1 of class a ");
    }

}
class B extends A{
    @Override
    public void meth1(){
        System.out.println(" i am meth 1 of class b");
    }
}
public class cwh_48_MO {
    public static void main(String[] args) {
        B b= new B();
        b.meth1();
    }
}

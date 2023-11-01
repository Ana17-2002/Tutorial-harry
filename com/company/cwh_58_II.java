package com.company;
interface Sampleinterface{
    void meth1();
    void meth2();
}
interface ChildSampleinterface extends Sampleinterface{
    void meth3();
    void meth4();
}
class imp implements ChildSampleinterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class cwh_58_II {
    public static void main(String[] args) {
        imp obj = new imp();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}

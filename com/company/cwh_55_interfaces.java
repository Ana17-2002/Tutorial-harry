package com.company;
interface Cycle {
    int a = 45;

    void decrement(int decrement);

    void speedup(int increment);
}
interface CycleHorn{
    int x = 45;
    void pee();
    void poo();
}
class HeroCycle implements Cycle,CycleHorn{
    public void decrement(int decrement){
    System.out.println("break is applied ");
    }
    public void speedup(int increment){
        System.out.println("speed is up");
    }
    public void pee(){
        System.out.println("peee peee peee");
    }
    public void poo(){
        System.out.println("pooo pooo poooo ");
    }
}

public class cwh_55_interfaces {
    public static void main(String[] args) {
    HeroCycle dhanno = new HeroCycle();
    dhanno.decrement(5);
    dhanno.speedup(6);
    dhanno.pee();
    dhanno.poo();
    System.out.println(dhanno.a);
    }
}

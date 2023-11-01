package com.company;
abstract class Pen{
abstract void write();
abstract void refill();
}
class LinkPen extends Pen{
    @Override
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changerefill(){
        System.out.println("change the refill");
    }
}
interface BasicAnimal{
    void eat ();
    void Sleep();
}
class Monkey{
    void jump(){
        System.err.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eat");
    }
    public void Sleep(){
        System.out.println("sleep");
    }
}

public class cwh_60_PS {
    public static void main(String[] args) {
        // LinkPen p = new LinkPen();
        // p.refill();
        // p.changerefill();
        // Human man = new Human();
        // man.Sleep();
        // Monkey mal = new Human();
        // mal.jump();
        //mal.Sleep();
    }
}

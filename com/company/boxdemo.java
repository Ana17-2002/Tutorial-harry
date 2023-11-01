package com.company;
class box{
    double height ;
    double weidth,depth;
    double volume(){
        return height*depth*weidth;
    }

}
public class boxdemo {
    public static void main(String[] args) {
        box b=  new box();
        b.depth=10;
        b.height=11;
        b.weidth=23;
        System.out.println("the volume of b is "+ b.volume());
    }
}

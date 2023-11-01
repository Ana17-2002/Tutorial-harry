package com.company;
interface MyCamera{
    void snap();
    void video();
    private void greet() {
    System.out.println("Good Morning");
    }
    default void Bestvideo(){
        greet();
        System.out.println(" taking 4 k video");
    }
}
interface Wifi{
    String [] Network();
    void getnetwork (string Net);
}
class MyCellPhone{
    void incomingcall(int number){
        System.out.println("call coming"+number);
    }
    void connect(){
        System.out.println("connecting");
    }
}
class MySmartPhone extends MyCellPhone implements Wifi,MyCamera{
    public void snap(){
        System.out.println(" photo khicho");
    }
    public void video(){
        System.out.println("starting video");
    }
    public String[] Network(){
    System.out.println("the names of the networks");
    String [] networklist={"ana","Arghya","hari"};
    return networklist;
    }
    public void getnetwork(string Net){
        System.out.println("connecting to "+ Net);
    }

}
public class cwh_57_DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone sm= new MySmartPhone();
        sm.Bestvideo();
        String [] ar = sm.Network();
        for (String i : ar) {
            System.out.println(i);
        }
    }
}

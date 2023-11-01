package com.company;

/**
 * em
 */
class em {
    int id;
    String name;

    public void des() {
        System.out.println("the id is " + id);
        System.out.println("the name of employee " + name);
    }

}

public class cwh_38_new_class {
    public static void main(String[] args) {
        em Ana=new em();
        em Arg=new em();
        Ana.id=19;
        Ana.name= "Anamitra Sengupta";
        Arg.id=25;
        Arg.name="Arghya Dutta";
        Ana.des();
        Arg.des();
    }
}

package com.company;
interface Study{
    void physics();
    void chemistry();
    void math();
    void biology();
    void bengali();
    void english();
}
interface PhysicalEducation{
    void yoga();
    void gym();
    void parade();
}
class School{
    void toilet(){
        System.out.println("there are 3 washrooms");
    }
    void classroom(){
        System.out.println("there are 60 classrooms");
    }
    void library(){
        System.out.println("there are a library");
    }
    void staffroom(){
        System.out.println("there are 5 staff rooms");
    }
}
class HinduSchool extends School implements Study,PhysicalEducation{
    public void physics(){System.out.println("we teach physics");}
    public void chemistry(){System.out.println("we teach chemistry");}
    public void math(){System.out.println("we teach math");}
    public void biology(){System.out.println("we teach biology");}
    public void bengali(){System.out.println("we teach bengali");}
    public void english(){System.out.println("we teach english");}
    public void yoga(){System.out.println("we teach yoga");}
    public void gym(){System.out.println("we teach gym");}
    public void parade(){System.out.println("we teach parade");}
}
public class cwh_59_polimorf {
    public static void main(String[] args) {
        Study porua = new HinduSchool();
        porua.math(); //here polimorfism implemented using dynamic dispatch
       // porua.gym(); not allowed
    }
}
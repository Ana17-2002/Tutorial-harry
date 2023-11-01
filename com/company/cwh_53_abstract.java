// Abstract class definition
package com.company;
abstract class Shape {
    // Abstract method (no implementation)
    abstract double calculateArea();
    
    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class that extends the abstract class
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


public class cwh_53_abstract {
public static void main(String[] args) {
    Circle circle = new Circle(7);
        circle.display();
        double area = circle.calculateArea();
        System.out.println("Circle Area: " + area);
}
}

package co.edu.unicauca.taller1;

import static java.lang.Math.pow;

public class Circle extends Figure {
    //private double radius;
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI* pow(radius,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}

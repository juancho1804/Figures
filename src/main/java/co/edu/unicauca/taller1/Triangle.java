package co.edu.unicauca.taller1;

public class Triangle extends Figure {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }

    public double calculateArea() {
        return (base*height)/2;
    }

    public double calculatePerimeter() {
        return base*3;
    }
}

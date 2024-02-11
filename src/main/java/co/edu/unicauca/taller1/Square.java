package co.edu.unicauca.taller1;

import static java.lang.Math.pow;

public class Square extends Figure{
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public double calculateArea() {
        return pow(side,2);
    }

    public double calculatePerimeter() {
        return side*4;
    }
}

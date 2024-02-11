package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static java.lang.Math.pow;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void TestCreate(){
        Square square= new Square(4.0);
        assertEquals(4.0,square.getSide());
    }
    @Test
    void TestCalculate(){
        Square square= new Square(4.0);
        assertEquals(pow(4.0,2),square.calculateArea());
        assertEquals(4.0*4,square.calculatePerimeter());
    }

}
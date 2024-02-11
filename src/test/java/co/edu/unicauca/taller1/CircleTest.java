package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static java.lang.Math.pow;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testCreate(){
        Circle circle = new Circle(2.0);
        assertEquals(2.0, circle.getRadius());
    }

    @Test

    void testCalculate(){
        Circle circle = new Circle(2.0);
        assertEquals(2.0*Math.PI*2.0, circle.calculatePerimeter());
        assertEquals(Math.PI*pow(2.0,2.0),circle.calculateArea());

    }



}
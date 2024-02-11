package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void TestCreate(){
        Triangle triangle = new Triangle(2.0,3.0);
        assertEquals(2.0,triangle.getBase());
        assertEquals(3.0,triangle.getHeight());
    }
@Test
    void TestCalculate(){
        Triangle triangle = new Triangle(2.0,3.0);
        assertEquals((2.0*3.0)/2,triangle.calculateArea());
        assertEquals(2.0*3,triangle.calculatePerimeter());
    }

}
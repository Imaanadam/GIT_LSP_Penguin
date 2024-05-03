package org.howard.edu.lsp.oopfinal.question3;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ShapeFactoryTest {
// test method making sure circle is created
    @Test
    public void testCreateCircle() {
        ShapeFactory f = new ShapeFactory();
        Shape circle = f.createShape("circle");
        // verifying the circle is correct 
        assertTrue(circle instanceof Circle);
    }
// test method making sure rectangle is created
    @Test
    public void testCreateRectangle() {
        ShapeFactory f = new ShapeFactory();
        Shape rectangle = f.createShape("rectangle");
        // verifying the rectangle is a instance of the correct shape
        assertTrue(rectangle instanceof Rectangle);
    }
}


package org.howard.edu.lsp.oopfinal.question3;

public class ShapeFactory {
	// method to create shape based on the type of shape 
    public Shape createShape(String type) {
    	// creates new circle object
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
            // if rectangle, creates new rectangle object
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
            // if neither return null and make nothing 
        } else {
            return null;
        }
    }
}

package org.howard.edu.lsp.oopfinal.question3;

public class Client {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
// creating cirlce using shape factory
        Shape circle = sf.createShape("circle");
        circle.draw();
// create rectangle using shape factory
        Shape rectangle = sf.createShape("rectangle");
        rectangle.draw();
    }
}

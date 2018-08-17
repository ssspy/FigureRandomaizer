package core.shapes;

import core.Color;

public class Square implements Shape {

    private double side;
    private Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(
                "Shape: square" +
                        ", area: " + String.format("%.1f", calculateArea()) + " square units" +
                        ", side length: " + String.format("%.1f", side) + " units" +
                        ", color: " + getColor().name().toLowerCase()
        );
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public Color getColor() {
        return color;
    }
}

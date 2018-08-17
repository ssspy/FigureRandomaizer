package core.shapes;

import core.Color;

public class Circle implements Shape {

    private double radius;
    private Color color;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(
                "Shape: circle" +
                        ", area: " + String.format("%.1f", calculateArea()) + " square units" +
                        ", radius: " + String.format("%.1f", radius) + " units" +
                        ", color: " + getColor().name().toLowerCase()
        );
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Color getColor() {
        return color;
    }
}

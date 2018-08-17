package core.shapes;

import core.Color;

import static java.lang.Math.*;

public class Trapeze implements Shape {

    private double sideA;
    private double sideB;
    private double angleAlpha;
    private double angleBeta;
    private Color color;

    public Trapeze(double sideA, double sideB, double angleAlpha, double angleBeta, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAlpha = angleAlpha;
        this.angleBeta = angleBeta;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(
                "Shape: trapeze" +
                        ", area: " + String.format("%.1f", calculateArea()) + " square units" +
                        ", height: " + String.format("%.1f", calculateHeight()) + " units" +
                        ", color: " + getColor().name().toLowerCase()
        );
    }

    private double calculateHeight() {
        return (max(sideA, sideB) - min(sideA, sideB)) / ((1 / tan(toRadians(angleAlpha))) + (1 / tan(toRadians(angleBeta))));
    }

    @Override
    public double calculateArea() {
        return ((sideA + sideB) * calculateHeight()) / 2;
    }

    @Override
    public Color getColor() {
        return color;
    }
}

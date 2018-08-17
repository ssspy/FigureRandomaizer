package core.shapes;

import core.Color;

import static java.lang.Math.*;

public class Triangle implements Shape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double angle;
    private Color color;

    public Triangle(double sideA, double sideB, double angle, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
        this.sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(toRadians(angle)));
        this.color = color;

        if (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB) {
            throw new RuntimeException(
                    String.format("Triangle with side A = %f, B = %f, C = %f does not exist!!!", sideA, sideB, sideC)
            );
        }
    }

    @Override
    public void draw() {
        System.out.println(
                "Shape: triangle" +
                        ", area: " + String.format("%.1f", calculateArea()) + " square units" +
                        ", perimeter: " + String.format("%.1f", calculatePerimeter()) + " units" +
                        ", color: " + getColor().name().toLowerCase()
        );
    }

    private double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        return (sideA * sideB * sin(toRadians(angle))) / 2;
    }

    @Override
    public Color getColor() {
        return color;
    }
}

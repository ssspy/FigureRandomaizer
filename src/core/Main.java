package core;


import core.shapes.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Color[] colors = Color.values();
        Shape shape;
        int shapeCount = 4;

        for (int i = 0; i < random.nextInt(150) + 50; i++) {
            switch (random.nextInt(shapeCount)) {
                default:
                case 0:
                    shape = new Circle(
                            randomizeWithoutZero(50),
                            colors[random.nextInt(colors.length)]
                    );
                    break;
                case 1:
                    shape = new Square(
                            randomizeWithoutZero(50),
                            colors[random.nextInt(colors.length)]
                    );
                    break;
                case 2:
                    shape = new Trapeze(
                            randomizeWithoutZero(50),
                            randomizeWithoutZero(50),
                            randomizeWithoutZero(90),
                            randomizeWithoutZero(90),
                            colors[random.nextInt(colors.length)]
                    );
                    break;
                case 3:
                    shape = new Triangle(
                            randomizeWithoutZero(50),
                            randomizeWithoutZero(50),
                            randomizeWithoutZero(180),
                            colors[random.nextInt(colors.length)]
                    );
                    break;
            }
            shape.draw();
        }
    }

    private static double randomizeWithoutZero(int bound) {
        double result = 0;
        while (result == 0) result = (bound * Math.random());
        return result;
    }
}

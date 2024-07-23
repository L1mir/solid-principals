package com.limir.solidprincipals.open_closed.good;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Rectangle(4, 6)
                // New shapes can be added without modifying the AreaCalculator class.
        };

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}


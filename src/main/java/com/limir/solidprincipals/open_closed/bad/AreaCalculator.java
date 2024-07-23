package com.limir.solidprincipals.open_closed.bad;

class AreaCalculator {
    public double calculateTotalArea(Object[] shapes) {
        double totalArea = 0;
        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                totalArea += Math.PI * Math.pow(circle.getRadius(), 2);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                totalArea += rectangle.getWidth() * rectangle.getHeight();
            }
            // If we add a new shape like Triangle, we need to modify this class.
        }
        return totalArea;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

package com.limir.solidprincipals.liskov_substitution.good;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rect.getArea()); // Outputs: Rectangle area: 50

        Shape square = new Square(5);
        System.out.println("Square area: " + square.getArea()); // Outputs: Square area: 25
    }
}


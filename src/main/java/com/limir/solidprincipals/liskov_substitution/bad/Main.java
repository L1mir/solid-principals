package com.limir.solidprincipals.liskov_substitution.bad;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println("Rectangle area: " + rect.getArea()); // Outputs: Rectangle area: 50

        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(10); // This should logically change the area, but it doesn't for Square
        System.out.println("Square area: " + square.getArea()); // Outputs: Square area: 100 (incorrect)
    }
}


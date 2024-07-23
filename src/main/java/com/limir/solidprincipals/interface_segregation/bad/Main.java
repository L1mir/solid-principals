package com.limir.solidprincipals.interface_segregation.bad;

public class Main {
    public static void main(String[] args) {
        Worker programmer = new Programmer();
        programmer.work();
        programmer.eat();

        Worker robot = new Robot();
        robot.work();
        try {
            robot.eat(); // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}

package com.limir.solidprincipals.interface_segregation.good;

public class Main {
    public static void main(String[] args) {
        Workable programmer = new Programmer();
        programmer.work();

        Eatable eatingProgrammer = (Eatable) programmer;
        eatingProgrammer.eat();

        Workable robot = new Robot();
        robot.work();
        // No need to call eat on Robot, as it doesn't implement Eatable
    }
}

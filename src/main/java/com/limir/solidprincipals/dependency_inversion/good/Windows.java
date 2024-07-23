package com.limir.solidprincipals.dependency_inversion.good;

public class Windows {
    private Keyboard keyboard;
    private Monitor monitor;

    public Windows(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void start() {
        System.out.println("Windows started with configurable keyboard and monitor.");
    }
}
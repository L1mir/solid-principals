package com.limir.solidprincipals.dependency_inversion;

public class Windows {
    private StandardKeyboard keyboard;
    private Monitor monitor;

    public Windows() {
        this.keyboard = new StandardKeyboard();
        this.monitor = new Monitor();
    }

    public void start() {
        System.out.println("Windows started with standard keyboard and monitor.");
    }
}

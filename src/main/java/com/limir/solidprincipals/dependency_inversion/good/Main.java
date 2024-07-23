package com.limir.solidprincipals.dependency_inversion.good;

public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new StandardKeyboard();
        Monitor monitor = new HighResolutionMonitor();
        Windows windows = new Windows(keyboard, monitor);
        windows.start();
    }
}

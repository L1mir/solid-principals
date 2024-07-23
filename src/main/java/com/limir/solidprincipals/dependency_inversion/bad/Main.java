package com.limir.solidprincipals.dependency_inversion.bad;

public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows();
        windows.start();
    }
}

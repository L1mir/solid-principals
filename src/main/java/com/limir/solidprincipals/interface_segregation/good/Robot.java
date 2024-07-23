package com.limir.solidprincipals.interface_segregation.good;

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}
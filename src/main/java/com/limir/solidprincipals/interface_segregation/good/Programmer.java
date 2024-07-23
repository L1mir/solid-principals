package com.limir.solidprincipals.interface_segregation.good;

class Programmer implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Programmer is coding.");
    }

    @Override
    public void eat() {
        System.out.println("Programmer is eating.");
    }
}
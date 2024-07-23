package com.limir.solidprincipals.interface_segregation.bad;

interface Worker {
    void work();
    void eat();
}

class Programmer implements Worker {
    @Override
    public void work() {
        System.out.println("Programmer is coding.");
    }

    @Override
    public void eat() {
        System.out.println("Programmer is eating.");
    }
}

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }

    @Override
    public void eat() {
        // Robot doesn't need to eat, but it's forced to implement this method
        throw new UnsupportedOperationException("Robot doesn't need to eat.");
    }
}

package com.limir.solidprincipals.liskov_substitution.bad;

class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Ensuring that width and height remain the same
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height; // Ensuring that width and height remain the same
    }
}


package com.abstractfactory;

public class BlueSquare extends Square {

    public BlueSquare(float height) {
        super(height, "BLUE");
    }

    @Override
    public void draw() {
        System.out.println("Dentro de Triangulo " + getColor()
                + " de altura " + getHeight() + " no método draw()");
    }
}

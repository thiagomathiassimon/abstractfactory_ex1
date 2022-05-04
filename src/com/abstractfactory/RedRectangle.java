package com.abstractfactory;

public class RedRectangle extends Rectangle {

    public RedRectangle(float base) {
        super(base, "RED");
    }

    @Override
    public void draw() {
        System.out.println("Dentro de Retangulo " + getColor()
                + " de base " + getBase() + " no método draw()");
    }
}

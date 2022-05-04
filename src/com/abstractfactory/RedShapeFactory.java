package com.abstractfactory;

public class RedShapeFactory extends AbstractFactory {

    @Override
    public Shape getCircle(float ray) {
        return new RedCircle(ray);
    }

    @Override
    public Shape getRectangle(float base) {
        return new RedRectangle(base);
    }

    @Override
    public Shape getSquare(float height) {
        return new RedSquare(height);
    }
}

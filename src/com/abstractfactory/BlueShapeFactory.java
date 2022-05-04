package com.abstractfactory;

public class BlueShapeFactory extends AbstractFactory {

    @Override
    public Shape getCircle(float ray) {
        return new BlueCircle(ray);
    }

    @Override
    public Shape getRectangle(float base) {
        return new BlueRectangle(base);
    }

    @Override
    public Shape getSquare(float height) {
        return new BlueSquare(height);
    }
}

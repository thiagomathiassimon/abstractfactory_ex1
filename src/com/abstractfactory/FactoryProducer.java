package com.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String color) {
        if ("BLUE".equalsIgnoreCase(color)) {
            return new BlueShapeFactory();
        } else if ("RED".equalsIgnoreCase(color)) {
            return new RedShapeFactory();
        }
        return null;
    }

}

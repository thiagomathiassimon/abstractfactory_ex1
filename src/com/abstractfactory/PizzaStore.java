package com.abstractfactory;

public class PizzaStore {

    /**
     * Cria uma pizza a partir do tipo especificado.
     *
     * @param type Tipo da pizza.
     * @return Pizza selecionada.
     */
    public Pizza orderPizza(String type) {

        Pizza pizza = SimplePizzaFactory.createPizza(type);

        System.out.println("Criando pizza:" + type);
        pizza.prepare();

        pizza.bake();

        pizza.cut();

        pizza.box();

        return pizza;

    }
}

package com.abstractfactory;

public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
        // Agora estamos pensando o tipo de pizza para orderPizza
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
            //} else if (type.eguals("greek")){
            //pizza = new GreekPizza();  
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("Veggie")) {
            pizza = new VeggiePizza();
            // Com base no tipo de pizza, instanciamos a classe concreta correta e a atribuímos à variáveis de instância de pizza. Observe que cada pizza aqui tem que implementar a interface Pizza
        } else if (type.equals("Clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}

package tn.enis.store;

import tn.enis.pizza.Pizza;
import tn.enis.pizza.SfaxStyleCheesePizza;
import tn.enis.pizza.SfaxStyleClamPizza;
import tn.enis.pizza.SfaxStylePepperoniPizza;

public class SfaxStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new SfaxStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new SfaxStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new SfaxStyleClamPizza();
        }
        return pizza;
    }
}

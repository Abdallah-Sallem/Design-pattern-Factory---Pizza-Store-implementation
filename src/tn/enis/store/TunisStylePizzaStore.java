package tn.enis.store;

import tn.enis.pizza.Pizza;
import tn.enis.pizza.TunisStyleCheesePizza;
import tn.enis.pizza.TunisStyleClamPizza;
import tn.enis.pizza.TunisStylePepperoniPizza;

public class TunisStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        if ("cheese".equals(type)){
            pizza=new TunisStyleCheesePizza();
        } else if ("pepperoni".equals(type)){
            pizza=new TunisStylePepperoniPizza();
        } else if ("clam".equals(type)){
            pizza=new TunisStyleClamPizza();
        }
        return pizza;
    }
}

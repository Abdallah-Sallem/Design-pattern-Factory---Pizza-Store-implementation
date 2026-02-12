package tn.enis.test;

import tn.enis.store.PizzaStore;
import tn.enis.store.TunisStylePizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore tunisps = new TunisStylePizzaStore();
        tunisps.orderPizza("cheese");
    }
}

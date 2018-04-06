package main.java.com.tauka.template;

import main.java.com.tauka.template.Beverage;

public class Coffee extends Beverage {
    protected void prepareIngredients() {
        System.out.println("-- BREWING COFFEE GRINDS --");
    }

    protected void additives() {
        System.out.println("-- ADDING SUGAR AND MILK --");
    }
}

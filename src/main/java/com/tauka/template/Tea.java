package main.java.com.tauka.template;

import main.java.com.tauka.template.Beverage;

public class Tea extends Beverage {
    protected void prepareIngredients() {
        System.out.println("-- STEEPING TEA BAG --");
    }

    protected void additives() {
        System.out.println("-- ADDING LEMON --");
    }
}

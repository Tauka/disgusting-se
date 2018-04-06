package main.java.com.tauka.template;

public abstract class Beverage {

    public final void prepareRecipe() {
        boilWater();
        prepareIngredients();
        pourInCup();
        additives();
    }

    public final void boilWater() {
        System.out.println("-- BOILING WATER --");
    }
    protected abstract void prepareIngredients();
    public final  void pourInCup() {
        System.out.println("-- POURING IN CUP --");
    }
    protected abstract void additives();


}

package main.java.com.tauka.template;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Coffee coffee = new Coffee();
        coffee.prepareIngredients();

        Tea tea = new Tea();
        tea.prepareIngredients();
    }
}

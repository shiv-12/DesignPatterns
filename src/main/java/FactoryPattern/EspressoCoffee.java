package FactoryPattern;

public class EspressoCoffee implements Coffee {
    @Override
    public void getCoffeeStatus() {
        System.out.println("Espresso Coffee is Ready for you!");
    }
}

package FactoryPattern;

public class CappuccinoCoffee implements Coffee {
    @Override
    public void getCoffeeStatus() {
        System.out.println("Cappuccino Coffee is Ready for you!");
    }
}

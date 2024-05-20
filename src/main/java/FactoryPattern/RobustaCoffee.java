package FactoryPattern;

public class RobustaCoffee implements Coffee {
    @Override
    public void getCoffeeStatus() {
        System.out.println("Robusta Coffee is Ready for you!");
    }
}

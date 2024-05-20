package StrategyPattern;

public class CODStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by Cod");
    }
}

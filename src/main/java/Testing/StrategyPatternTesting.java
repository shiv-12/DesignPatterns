package Testing;

import StrategyPattern.CreditCardStrategy;
import StrategyPattern.PaymentStrategy;
import Testing.Test.Test;

public class StrategyPatternTesting implements Test {
    @Override
    public void test() {

        System.out.println("\nStrategy Pattern Calling : ");

        PaymentStrategy paymentStrategy;

//         For CreditCard Payment
        paymentStrategy = new CreditCardStrategy("305658945623", "03/12", "888");

//         For UPI Payment
//        paymentStrategy = new UPIBasedStrategy("7898337488");

//         For CashOnDelivery Payment
//        paymentStrategy = new CODStrategy();

        paymentStrategy.pay(717);

    }
}

/*

The Strategy Pattern allows us to define a family of algorithms,
encapsulate each one as a separate class,
and make them interchangeable.
This pattern lets you change the algorithm used by an object at runtime without modifying the client side code.

If we have multiple Strategies for based on PaymentMethods then we can use that pattern
Create interface called PaymentStrategy
and create all their concrete implementations for COD, UPI, CreditCard Separately

*/

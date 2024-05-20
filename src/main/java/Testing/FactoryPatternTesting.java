package Testing;

import FactoryPattern.Coffee;
import FactoryPattern.CoffeeFactory;
import FactoryPattern.CoffeeNames;
import Testing.Test.Test;

public class FactoryPatternTesting implements Test {
    @Override
    public void test() {

        System.out.println("\nFactory Pattern Calling : ");
        Coffee coffee = CoffeeFactory.ready(CoffeeNames.ESPRESSO);
        coffee.getCoffeeStatus();
    }
}

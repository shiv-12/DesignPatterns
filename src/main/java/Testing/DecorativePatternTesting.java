package Testing;

import DecorativePattern.Pizza;
import DecorativePattern.Toppings.CheeseTopping;
import DecorativePattern.Toppings.OliveTopping;
import DecorativePattern.bases.ThinCrustBase;
import Testing.Test.Test;

public class DecorativePatternTesting implements Test {
    @Override
    public void test() {
        System.out.println("\nDecorative Pattern Calling : ");
        Pizza pizza = new CheeseTopping(new OliveTopping(new ThinCrustBase()));
        System.out.println(pizza.getName());
        System.out.println(pizza.getAmount());
    }
}
/*

If there is a base case
there are multiple different Toppings above it
then we can make use of Decorative Design Pattern

with the help of this
we don't need to create separate classes for each topping's combination

Note : we need to make our Pizza and Topping class as abstracted So that no one can create object of it!

*/

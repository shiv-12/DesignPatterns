package FactoryPattern;

public class CoffeeFactory {

    public static Coffee ready(CoffeeNames coffeeNames) {
        Coffee coffee;
        if (coffeeNames.equals(CoffeeNames.CAPPUCCINO))
            coffee = new CappuccinoCoffee();
        else if (coffeeNames.equals(CoffeeNames.ROBUSTA))
            coffee = new RobustaCoffee();
        else if (coffeeNames.equals(CoffeeNames.ESPRESSO))
            coffee = new EspressoCoffee();
        else
            throw new RuntimeException("Coffee Not Found!");
        return coffee;
    }
}


/*

Drawback of Factory patterns is that -
creational responsibilities (String x hai then xObj call honga type)
remove nahi hui hai bss delegate hui hai

also yadi coffee factory mai ingredients bhi include ho jaaye then Factory class will depends on lot more
Concrete classes which is not good

So to avoid such problems we need to use Abstract Factory Pattern!
*/
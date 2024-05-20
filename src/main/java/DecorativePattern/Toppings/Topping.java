package DecorativePattern.Toppings;

import DecorativePattern.Pizza;

public abstract class Topping extends Pizza {

    private final Pizza pizza;

    public Topping(String name, int amount, Pizza pizza) {
        super(name, amount);
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return super.getName() + pizza.getName();
    }

    @Override
    public int getAmount() {
        return super.getAmount() + pizza.getAmount();
    }
}

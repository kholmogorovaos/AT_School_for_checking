package com.fruitbase.fruits;
import java.math.BigDecimal;
abstract public class Fruit {
    protected double weight;
    protected BigDecimal price;
    protected String name;

    public double getWeight() {
        return weight;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}

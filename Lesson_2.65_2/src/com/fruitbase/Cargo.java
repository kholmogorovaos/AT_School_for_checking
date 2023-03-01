package com.fruitbase;
import com.fruitbase.fruits.*;
import java.math.BigDecimal;
public class Cargo {
    private double totalWeight = 0;
    private BigDecimal totalPrice = BigDecimal.valueOf(0);
    Fruit[] fruits;
    int i = 0;
    Fruit[] addedFruit = new Fruit[10];
    public Cargo() {
        fruits = new Fruit[]{new Apple(), new Orange(), new Banana(), new Pineapple() };
    }
    public double getTotalWeight() {
        return totalWeight;
    }
    public BigDecimal getTotalPrice(){
        return totalPrice;
    }
    void addFruit(Fruit fruit) {
        if (fruit != null) {
            addedFruit[i] = fruit;
            i++;
                totalWeight += fruit.getWeight();
                totalPrice = totalPrice.add(fruit.getPrice());
        }
    }
}




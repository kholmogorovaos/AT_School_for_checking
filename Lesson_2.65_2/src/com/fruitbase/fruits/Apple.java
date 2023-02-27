package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Apple extends Fruit {
    public Apple (String name){
        this.name = name;
        weight = 5;
        price = BigDecimal.valueOf(75);
    }
    @Override
    public String toString() {
        return  "название: " + name +
                ", вес: " + weight + " кг " +
                ", цена: " + price + " у.е.";
    }
}

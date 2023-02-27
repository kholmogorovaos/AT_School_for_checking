package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Orange extends Fruit {
    public Orange (String name){
        this.name = name;
        weight = 15.5;
        price = BigDecimal.valueOf(78.65);
    }
    @Override
    public String toString() {
        return  "название: " + name +
                ", вес: " + weight + " кг " +
                ", цена: " + price + " у.е.";
    }
}

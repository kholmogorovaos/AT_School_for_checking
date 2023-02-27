package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Pineapple extends Fruit {
    public Pineapple (String name){
        this.name = name;
        weight = 3;
        this.price = BigDecimal.valueOf(102.45);
    }
    @Override
    public String toString() {
        return  "название: " + name +
                ", вес: " + weight + " кг " +
                ", цена: " + price + " у.е.";
    }
}

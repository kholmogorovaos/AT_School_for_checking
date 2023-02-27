package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Banana extends Fruit {
    public Banana (String name){
        this.name = name;
        weight = 12.8;
        price = BigDecimal.valueOf(26.35);
    }
    @Override
    public String toString() {
        return  "название: " + name +
                ", вес: " + weight + " кг " +
                ", цена: " + price + " у.е.";
    }
}

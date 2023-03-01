package com.fruitbase;
import com.fruitbase.fruits.*;
public class FruitCatalogue {
    Fruit[] fruits;
    FruitCatalogue() {
        fruits = new Fruit[]{new Apple(), new Orange(), new Banana(), new Pineapple()};
    }
    Fruit findFruit(String array) {
        for (int i = 0; i < fruits.length; i++) {
            if (array.equals(fruits[i].getName())) {
                return fruits[i];
            }
        }
        return null;
    }
}




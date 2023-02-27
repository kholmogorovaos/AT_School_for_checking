package com.fruitbase;
import com.fruitbase.fruits.*;
import java.math.BigDecimal;
public class FruitCatalogue {
    Fruit[] fruits;
FruitCatalogue() {
    fruits = new Fruit[]{new Apple("Яблоки"), new Orange("Апельсины"), new Banana("Бананы"),
             new Pineapple("Ананасы") };}
     Fruit findFruit(String[] array) {
         if (array.length != 0)
             for (int i = 0; i < array.length; i++) {
                 array[i].equals(fruits[i]);
                 Fruit fruits = new Fruit() {
                     @Override
                     public double getWeight() {
                         return getWeight();
                     }
                     @Override
                     public BigDecimal getPrice() {
                         return getPrice();
                     }
                     @Override
                     public String getName() {
                         return getName();
                     }
                 }; return fruits;
             }
         return null;
     }
}




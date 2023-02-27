package com.fruitbase;
import com.fruitbase.fruits.*;
import java.math.BigDecimal;
import java.util.ArrayList;
public class Cargo {
    private double totalWeight;
    private BigDecimal totalPrice;
    private ArrayList<String> fruitList;
    Fruit[] fruits = new Fruit[]{new Apple("Яблоки"), new Orange("Апельсины"), new Banana("Бананы"),
            new Pineapple("Ананасы") };
    public Cargo() {
        this.fruitList = new ArrayList<>();
    }
    public double getTotalWeight() {
        Fruit fruits = new Fruit();
        totalWeight += fruits.getWeight();
        return totalWeight;
    }
    public BigDecimal getTotalPrice(){
        Fruit fruits = new Fruit();
        totalPrice = totalPrice.add(fruits.getPrice());
        return totalPrice;
    }
    void addFruit(String fruit){
        fruitList.add(fruit);
    }
}

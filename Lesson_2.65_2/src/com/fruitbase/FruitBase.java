package com.fruitbase;
public class FruitBase {
    FruitCatalogue fruitCatalogue;
    FruitBase (){
        fruitCatalogue = new FruitCatalogue();
    }
    public static void main(String[] args) {
        if (args.length != 0) {
        FruitBase fruitBase = new FruitBase();
        Cargo cargo = fruitBase.takeOrder(args);
            System.out.println("Общий вес заказа: " + cargo.getTotalWeight() + " кг");
            System.out.println("Общая стоимость заказа: " + cargo.getTotalPrice() + " у.е.");
        } else System.out.println("Запрос пустой, укажите фрукты для формирования заказа");
        System.exit(0);
    }
    public Cargo takeOrder(String[] strArray){
        Cargo cargo = new Cargo();
        if (strArray != null) {
            for (int i = 0; i < strArray.length; i++) {
                cargo.addFruit(fruitCatalogue.findFruit(strArray[i]));
            }
        }
        return cargo;
    }
}

package com.fruitbase;

public class FruitBase {
    String[] fruitCatalogue;
//    содержит поле FruitCatalogue
//    содержит конструктор без параметров в нем инициализируется поле FruitCatalogue
    FruitBase (){
       // fruitCatalogue = args[0];
    }
    public static void main(String[] args) {
        String[] strArray = args;
        if (strArray.length != 0) {
      //  FruitBase[] fruitBase = new FruitBase[];
      //      for (FruitBase fruitBase1: fruitBase){

      //  fruitBase.takeOrder(strArray);
      //  System.out.println(fruitBase);

        } else System.out.println("Запрос пустой, укажите фрукты для формирования заказа");
        System.exit(0);
    }
    public void takeOrder(String[] strArray){
        FruitCatalogue fruitCatalogue1 = new FruitCatalogue();
        for (int i = 0; i < strArray.length; i++) {
            fruitCatalogue1.findFruit(strArray);
        }
        Cargo cargo = new Cargo();
        if (strArray != null) {
            for (int i = 0; i < strArray.length; i++) {
                cargo.addFruit(String.valueOf(strArray));
                cargo.getTotalWeight();
                cargo.getTotalPrice();
            }
        } else System.out.println("0");;
    }
}

package mypackage;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
        food = "Я люблю мышек!";
        foodCounter = 8;
        location = "Иордания";
        health = HealthState.HEALTHY;
        counter = 9;
    }
    @Override
    public void makeSound(){
        System.out.println("Я говорю: Мяу!");
    }
    @Override
    public void eat(){
        foodCounter =  foodCounter - 2;
        System.out.println(food+"\n" + "Осталось еды: " + foodCounter + "кг");
    }
    @Override
    public String toString() {
           return "Кличка='" + name + ", Страна обитания=" + location + ", Состояние здоровья=" + health + ", Количество особей=" + counter;
        }
}

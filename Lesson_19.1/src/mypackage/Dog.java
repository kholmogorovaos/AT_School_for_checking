package mypackage;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
        food = "Я люблю косточки!";
        foodCounter = 6;
        location = "Россия";
        health = HealthState.HEALTHY;
        counter = 7;
    }
    @Override
    public void makeSound() {
        System.out.println("Я говорю: Гав-Гав!");
    }

    @Override
    public void eat() {
        foodCounter = foodCounter - 2;
        System.out.println(food+"\n" + "Осталось еды: " + foodCounter + "кг");
    }

    @Override
    public String toString() {
           return "Кличка='" + name + ", Страна обитания=" + location + ", Состояние здоровья=" + health + ", Количество особей=" + counter;
        }
  }

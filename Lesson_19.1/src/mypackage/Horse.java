package mypackage;

public class Horse extends Animal {
    public Horse (String name) {
        this.name = name;
        food = "Я люблю овес!";
        foodCounter = 10;
        location = "Марокко";
        health = HealthState.UNHEALTHY;
        counter = 2;
    }
    @Override
    public void makeSound(){
        System.out.println("Я говорю: И-го-го!");
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

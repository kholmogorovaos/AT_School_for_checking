package mypackage;
public abstract class Animal {
    public String name;
    public String food;
    public int foodCounter;
    public String location;
    public int counter;
    public HealthState health;

    public abstract void makeSound() ;
    public abstract void eat();

    public void sleep(){
        System.out.println("Животное спит!");
    }
    public String toString() {
        return "Кличка='" + name + ", Страна обитания=" + location + ", Состояние здоровья=" + health + ", Количество особей=" + counter;
        }
}

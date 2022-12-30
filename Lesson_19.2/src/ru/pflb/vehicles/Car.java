package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Car {
    public String model = "Легковой автомобиль";
    public VehicleClass vehicleClass = VehicleClass.MEDIUM;
    public int weight = 3;
    public Driver driver = new Driver("Антонов","8 лет", "85967ab52");
    public Engine engine = new Engine("ВАЗ", "125 л.с");
    public static void start() {
        System.out.println("Поехали!");
    }
    public static void stop() {
        System.out.println("Останавливаемся");
    }
    public static void turnRight() {
        System.out.println("Поворот направо");
    }
    public static void turnLeft() {
        System.out.println("Поворот налево");
    }
    public String toString() {
        return "Модель: " + model + ", класс: " + vehicleClass + "\n"
                + "Характеристики:" + "\n"
                + "  вес: " + weight + " тонны" + "\n"
                + "  двигатель: " + engine + "\n"
                + "Водитель: " + driver;
    }
}

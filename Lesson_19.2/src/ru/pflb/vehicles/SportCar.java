package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class SportCar extends Car {
    public SportCar(String model) {
        this.model = model;
        vehicleClass = VehicleClass.SPORTS_CAR;
        weight = 3;
    }
    public Driver driver = new Driver("Петров", "15 лет", "DS5852fg52");
    public Engine engine = new Engine("Феррари", "350 л.с.");
    public String maxVelocity = "350 км/ч";
    @Override
    public String toString() {
        return "Модель: " + model + ", класс: " + vehicleClass + "\n"
                + "Характеристики:" + "\n"
                + "  вес: " + weight + " тонны" + "\n"
                + "  двигатель: " + engine + "\n"
                + "  максимальная скорость: " + maxVelocity + "\n"
                + "Водитель: " + driver;
    }
}

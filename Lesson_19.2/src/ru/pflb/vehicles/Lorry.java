package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Lorry extends Car {
    public Lorry(String model){
        this.model = model;
        vehicleClass = VehicleClass.LARGE;
        weight = 5;

    }
    public Driver driver = new Driver("Иванов", "30 лет", "45897fg52");
    public Engine engine = new Engine("КАМАЗ", "105 л.с");
    public String loadingAmount = "50 кг";
    @Override
    public String toString() {
        return "Модель: " + model + ", класс: " + vehicleClass + "\n"
                + "Характеристики:" + "\n"
                + "  вес: " + weight + " тонн" + "\n"
                + "  двигатель: " + engine + "\n"
                + "  грузоподъемность: " + loadingAmount + "\n"
                + "Водитель: " + driver;
    }
}

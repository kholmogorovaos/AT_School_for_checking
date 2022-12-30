package ru.pflb;

import ru.pflb.vehicles.Car;
import ru.pflb.vehicles.Lorry;
import ru.pflb.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
       Lorry lorry = new Lorry("Грузовик");
       Lorry.start();
       System.out.println(lorry + "\n");
       SportCar sportCar = new SportCar("Спорткар");
       SportCar.stop();
       System.out.println(sportCar + "\n");
       Car Car = new Car();
       System.out.println(Car + "\n");
       Car.turnRight();
       Car.turnLeft();
    }
}

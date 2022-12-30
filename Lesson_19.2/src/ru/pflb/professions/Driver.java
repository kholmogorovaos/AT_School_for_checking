package ru.pflb.professions;

import ru.pflb.Person;

public class Driver extends Person {
    public Driver(String name, String driverExperience, String licenseID){
        this.name = name;
        this.driverExperience = driverExperience;
        this.licenseID = licenseID;
    }
    @Override
   public String toString() {
       return name + "\n" + "возраст: " + age + "\n"
               + "стаж: " + driverExperience + "\n"
               + "№ удостоверения: " + licenseID;
   }
}

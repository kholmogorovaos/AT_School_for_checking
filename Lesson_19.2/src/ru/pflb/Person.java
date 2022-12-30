package ru.pflb;

public abstract class Person {
    public int age;
    public String name;
    public String driverExperience;
    public String licenseID;
    public Person(){
        name = "Иван";
        age = 35;
    }
    public String toString() {
        return name + "\n" + "возраст: " + age + "\n";
    }
}

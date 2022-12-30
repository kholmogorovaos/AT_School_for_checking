package ru.pflb.details;

 public class Engine {
      String vendor;
      String power;
     public Engine (String vendor, String power) {
         this.vendor = vendor;
         this.power = power;
     }
    public String toString() {
        return vendor + ", мощность: " + power;
    }

}

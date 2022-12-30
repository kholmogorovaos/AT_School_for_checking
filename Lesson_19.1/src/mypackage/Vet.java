package mypackage;

public class Vet {
    String name;
    public Vet(String name) {
        this.name = name;
    }
    void treatAnimal(Animal animal) {
         if (animal.health == HealthState.UNHEALTHY) {
             System.out.println("Запланирован визит у ветеринара: Суворовой Марии" + ": Будет назначено лечение");}
         else {System.out.println("Запланирован визит у ветеринара: Суворовой Марии" + ": Лечение не требуется");}
    }
}

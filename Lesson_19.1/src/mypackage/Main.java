package mypackage;

public class Main {

        public static void main(String[] args){
           Animal[] animals = new Animal[]{new Cat("Пуся"), new Dog("Барбос"), new Horse("Красавчик")};
                for(Animal animal: animals){
                    System.out.println(animal);
                    animalInfo(animal);
                }
                    System.out.println("Красавчик:");
                    animals[2].eat();
                    animals[2].sleep();
                    }
    public static void animalInfo(Animal animal) {
                Vet vet = new Vet("Суворова Мария");
                animal.makeSound();
                vet.treatAnimal(animal);
                System.out.println("\n");
        }
    }

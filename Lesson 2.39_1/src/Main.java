public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{new Cat(2,"Голубой", 3, "тигровый"),new Cat(5),new Cat(3,8),
                new Cat("Желтый", 5, "леопардовый"),new Cat(4, "Зеленый", "серый")};
        for (Cat cat : cats)
            System.out.println(cat);

        Animal.testStaticMethod();
        Cat.testStaticMethod();
        Cat cat = new Cat(5);
        cat.testStaticMethod();

        System.out.println(Animal.planet);
        Animal.planet = "Луна";
        System.out.println(cat.planet);
    }
}

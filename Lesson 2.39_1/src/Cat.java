public class Cat extends Animal{
    public int age;
    public String eyescolor;
    public int weight;
    public String furcolor;
    public Cat(int age, String eyescolor, int weight, String furcolor) {
        this.age = age;
        this.eyescolor = eyescolor;
        this.weight = weight;
        this.furcolor = furcolor;
    }
    @Override
    public String toString() {
        return "Cat {" +
                "Возраст= " + age + " года" +
                ", Цвет глаз= '" + eyescolor + '\'' +
                ", вес= " + weight + " кг" +
                ", окрас= '" + furcolor + '\'' +
                '}';
    }
    public Cat(int age) {
        this.age = age;
    }
    public Cat(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }
       public Cat(String eyescolor, int weight, String furcolor) {
        this.eyescolor = eyescolor;
        this.weight = weight;
        this.furcolor = furcolor;
    }
    public Cat(int age, String eyescolor, String furcolor) {
        this.age = age;
        this.eyescolor = eyescolor;
        this.furcolor = furcolor;
    }
}

public class Program2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("Задание 2:");
        System.out.println("Значение переменной а= " + a);
        System.out.println("Значение переменной b= " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новое значение переменной а= " + a);
        System.out.println("Новое значение переменной b= " + b);
    }
}

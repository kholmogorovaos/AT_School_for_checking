public class Program1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int change = a;
        System.out.println("Задание 1:");
        System.out.println("Значение переменной а= " + a);
        System.out.println("Значение переменной b=" + b);
        a = b;
        b = change;
        System.out.println("Новое значение переменной а= " + a);
        System.out.println("Новое значение переменной b= " + b);
    }
}

public class Program1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int change = a;
        System.out.println("Задание 1:");
        System.out.println(String.format("Значение переменной а = %s", a));
        System.out.println(String.format("Значение переменной b = %s", b));
        a = b;
        b = change;
        System.out.println(String.format("Новое значение а = %s", a));
        System.out.println(String.format("Новое значение b = %s", b));
    }
}

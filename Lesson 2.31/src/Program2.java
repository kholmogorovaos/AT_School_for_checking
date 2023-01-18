public class Program2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("Задание 2:");
        System.out.printf("Значение переменной а = %s", a + "\n");
        System.out.printf("Значение переменной b = %s", b + "\n");
        a += b;
        b = a - b;
        a -= b;
        System.out.printf("Новое значение переменной а = %s", a + "\n");
        System.out.printf("Новое значение переменной b = %s", b + "\n");
    }
}

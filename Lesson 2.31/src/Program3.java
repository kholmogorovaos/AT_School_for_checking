public class Program3 {
      public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Задание 3:");
        System.out.println("Значение первой переменной= " + a);
        System.out.println("Значение второй переменной= " + b);
        try {
            Boolean c = a % b == 0;
            System.out.println("Переменные делятся без остатка= " + c);
        } catch (RuntimeException exp) {
            System.out.println("Переменные делятся без остатка= false");
        }
    }
}
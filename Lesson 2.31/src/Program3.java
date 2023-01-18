public class Program3 {
      public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Задание 3:");
        System.out.printf("Дано: а = %s,", a);
        System.out.printf(" b = %s", b + "\n");
        Boolean c = a % b == 0;
        System.out.println(c);
      }
}
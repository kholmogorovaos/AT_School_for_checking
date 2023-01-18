public class Program4 {
    public static void main(String[] args) {
       estimation(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Integer.parseInt(args[2]));
    }
    public static void estimation(double P, double r, int t) {
        double summa = (P * Math.exp(r/100*t));
        System.out.println("Задание 4:");
        System.out.printf("Дано: P = %s, ", P);
        System.out.printf("r = %s, ", r);
        System.out.printf("t = %s ", t + "\n");
        System.out.println(summa);
    }
}

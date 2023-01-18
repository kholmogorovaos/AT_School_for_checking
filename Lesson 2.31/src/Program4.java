public class Program4 {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        int t = Integer.parseInt(args[2]);
        double summa = (P * Math.exp(r/100*t));
        System.out.println("Задание 4:");
        System.out.printf("Дано: P = %s, ", P);
        System.out.printf("r = %s, ", r);
        System.out.printf("t = %s ", t + "\n");
        System.out.println(summa);
    }
}

public class Program4 {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        int t = Integer.parseInt(args[2]);
        double summa = (P * Math.exp(r*t));
        System.out.println("Задание 4:" +"\n" + "Будущая сумма размещения денег под процент " + r + " годовых через "
                + t + " лет = " + summa);
    }
}

public class Task6 {
    public static void main(String[] args) {
        int seconds = Integer.parseInt(args[0]);
        if (seconds < 0) {
            System.out.println("Введенное значение должно быть больше или равно нулю");
        } else {
            Timer timer = new Timer(seconds);
            timer.start();
        }
    }
}

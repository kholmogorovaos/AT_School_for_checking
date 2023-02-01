import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        int n = 10;
        Task4 main = new Task4();
        do System.out.println(main.nextInt(n));
        while (main.isPrime(main.nextInt(n)) == true);
        System.out.println("Сгенерированное число составное");
    }
    public boolean isPrime(int x) {
        boolean isPrime = true;
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public int nextInt(int x) {
           return new Random().nextInt(x + 1);
    }
}

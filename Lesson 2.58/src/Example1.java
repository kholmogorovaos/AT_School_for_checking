import java.util.Random;
public class Example1 {
    public static void main(String[] args) {
        int a[] = new int[20];
        Example1 main = new Example1();
        main.fillArray(a);
        for (int i = 0; i< 20; i++) {
            System.out.printf(a[i] + " ");
        }
    }
    public void fillArray(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(19) - 9;
        }
    }
}

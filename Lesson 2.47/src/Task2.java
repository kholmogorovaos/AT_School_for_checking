public class Task2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        if (m >= 0 && n>=0) {
            m = m * n * 60;
            int i = 0;
            while (i < n){
                m = ((2 * m + 10 * (n - 1)))/2;
                i++;
            }
            System.out.println("Бригада работала: " + m / 60 + " часа(ов) " + m % 60 + " минут");
        }
        else System.out.println("Введенные значения не могут быть меньше 0");
    }
}

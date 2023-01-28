public class Task3 {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        if (year >= 0 && year <= 30000) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else System.out.println("Ошибка: введенный год не входит в вычисляемый период");
    }
}

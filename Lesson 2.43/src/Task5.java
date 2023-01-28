public class Task5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e;
        int f;
        if ((a >= 0) && (b >= 0) && (c >= 0) && (d >= 0)) {
           if (((e = (100*c+d-100*a-b)/100) >= 0) && ((f = (100*c+d-100*a-b)%100)) >= 0) {
                System.out.println(String.format("Сдача = %d руб. %02d коп.", e, f));
            }
           else System.out.println("Денег на покупку не хватает");
        }
        else System.out.println("Ошибка: введенное число меньше нуля");
    }
}

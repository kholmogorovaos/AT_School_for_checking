public class Task4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if ((a > 0) && (b > 0) && (c > 0)) {
            if (((a + b) > c) ^ ((a + c) > b) ^ ((b + c) > a)) {
                if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
                    System.out.println("right");
                } else if (Math.pow(c, 2) < (Math.pow(a, 2) + Math.pow(b, 2))) {
                    System.out.println("acute");
                } else if (Math.pow(c, 2) > (Math.pow(a, 2) + Math.pow(b, 2))) {
                    System.out.println("obtuse");
                }
            } else System.out.println("impossible");
        }
        else System.out.println("Введеное значение стороны треугольника должно содержать натуральное число");
    }
}



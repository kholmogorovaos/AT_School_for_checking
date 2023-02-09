public class Calculator {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        String operation = String.valueOf(args[1]);
            switch (operation) {
                case "+":
                    System.out.println("Сумма чисел равна: " + add(x, y));
                    break;
                case "-":
                    System.out.println("Разность чисел равна: " + sub(x,y));
                    break;
                case "*":
                    System.out.println("Произведение чисел равно: " + mult(x,y));
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println(String.format("Операция не может быть выполнена, y = %s", y));
                        System.exit(0);
                    } else
                    System.out.println("Частное чисел равно: " + divide(x,y));
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод. Поддерживаемые операции: +,-,*,/");
            }
        }

    public static int add(int x, int y){
           return x + y;
    }
    public static int sub(int x, int y){
        return x - y;
    }
    public static int mult(int x, int y) {
        return x * y;
    }
    public static int divide(int x, int y) {
        return x / y;
    }
}


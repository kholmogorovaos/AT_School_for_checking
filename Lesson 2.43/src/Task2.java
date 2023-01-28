public class Task2 {
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    switch (a) {
        case 1:
            System.out.println(String.format("%s - Понедельник", a));
            break;
        case 2:
            System.out.println(String.format("%s - Вторник", a));
            break;
        case 3:
            System.out.println(String.format("%s - Среда", a));
            break;
        case 4:
            System.out.println(String.format("%s - Четверг", a));
            break;
        case 5:
            System.out.println(String.format("%s - Пятница", a));
            break;
        case 6:
            System.out.println(String.format("%s - Суббота", a));
            break;
        case 7:
            System.out.println(String.format("%s - Воскресенье", a));
            break;
        default:
            System.out.println("Ошибка: такого дня недели не существует");
            break;
        }
    }
}


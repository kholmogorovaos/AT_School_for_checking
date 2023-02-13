public class Task1 {
    public static String s = "Циклом называется многократное выполнение одних и тех же действий.";

    public static void main(String[] args) {
        String letter = String.valueOf(args[0]);
        s = s.replaceAll("\\s", "");
        int a = s.indexOf(letter);
        s = s.substring(0, a);
        s = String.valueOf(s.length());
        System.out.println("Через аргументы передается: " + letter + ", Вывод: " + s + ".");
    }
}

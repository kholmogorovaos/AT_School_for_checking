public class Task4 {
    public static void main(String[] args) {
        String str = String.valueOf(args[0]);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                output.append(str.charAt(i));
            }
        }
        System.out.println("Вывод: " + output);
    }
}

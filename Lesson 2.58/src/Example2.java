public class Example2 {
    public static void main(String[] args) {
        String[] strArray = args;
        int maxIndex = 0;
        String result = "";
        if (strArray.length != 0) {
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].matches("[a-z0-9]+")) {
                    if (strArray[i].length() > maxIndex) {
                        maxIndex = strArray[i].length();
                        result = strArray[i] + "\t";
                    } else if (strArray[i].length() == maxIndex) {
                        maxIndex = strArray[i].length();
                        result += strArray[i] + "\t";
                    }
                } else {
                    System.out.println("Введенные аргументы должны состоять из строчных латинских букв и цифр");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Введите аргументы в командную строку");
            System.exit(0);
        }
        System.out.println(result);
    }
}

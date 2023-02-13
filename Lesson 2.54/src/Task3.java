public class Task3 {
    public static void main(String[] args) {
        String line = String.valueOf(args[0]);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if (currentChar == '0') {
                str.append('1');
            } else if (currentChar == '1') {
                str.append('0');
            } else {
                str.append(currentChar);
            }
        }
        System.out.println(str);
    }
}

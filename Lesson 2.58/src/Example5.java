import java.util.Arrays;
import java.util.Random;
public class Example5 {
    public static void main(String[] args) {
        int[][] a = new int[5][];
        int[] s = new int[5];
        String[] strArray = new String[a.length];
        a[0] = new int[4];
        a[1] = new int[6];
        a[2] = new int[5];
        a[3] = new int[3];
        a[4] = new int[7];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(19) - 9;
            }
        }
        System.out.println("Зубчатый массив до сортировки: ");
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        } System.out.println();
        System.out.println("Сумма строк зубчатого массива");
        int i = 0;
        s[i] = 0;
        for( i = 0; i< a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                s[i] += a[i][j];
            } System.out.print(s[i] + " ");
        }
        System.out.println();
        for ( i = 0; i < a.length; i++) {
            strArray[i] = Arrays.toString(a[i]);
        }
        int temp = 0;
        String strTemp = "";
        for (i = 0; i < strArray.length; i++) {
            if (i + 1 < strArray.length) {
                for (int k = 0; k < s.length - 1; k++) {
                    if (s[k] < s[k + 1]) {
                        temp = s[k];
                        s[k] = s[k + 1];
                        s[k + 1] = temp;
                        strTemp = strArray[k];
                        strArray[k] = strArray[k + 1];
                        strArray[k + 1] = strTemp;
                        }
                    }
                }
            }
        System.out.println("Отсортированный массив по убыванию сумм элементов в строке: ");
        for (i = 0; i <strArray.length; i++) {
            String[] items = strArray[i].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");;
            int[] results = new int[items.length];
            for (int j = 0; j < items.length; j++) {
                    results[j] = Integer.parseInt(items[j]);
                    System.out.printf("% 2d ", results[j]);
            }
            System.out.println();
        }
    }
}

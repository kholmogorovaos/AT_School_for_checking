public class Task3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        if (n >= 1 && col > 0) {
            Task3 main = new Task3();
            main.snakePrint(n, col);
        } else System.out.println("Ошибка: неверно введены значения");
    }
        public void snakePrint(int n, int col) {
            int n1 = n/col + (n % col == 0 ? 0 : 1);
            int matrix[][] = new int[n1][col];
            int value = 1;
            for (int i = 0; i < n1; ++i) {
                if (i % 2 == 0)  {
                    for (int j = 0; j < col; ++j) {
                        matrix[i][j] = value;
                        value++;
                    }
                }
                else {
                    for (int j = col-1; j >= 0; --j) {
                        matrix[i][j] = value;
                        value++;
                    }
                }
            }
            for (int i = 0; i < matrix.length; ++i) {
                for (int j = 0; j < matrix[i].length; ++j) {
                    if (matrix[i][j] <= n) {
                        System.out.printf(matrix[i][j] + " ");
                    } else
                        System.out.printf(" ".repeat(Integer.toString(matrix[i][j]).length() + 1));
                } System.out.println();
            }
        }
}

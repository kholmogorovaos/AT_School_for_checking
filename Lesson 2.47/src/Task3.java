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
        int n1 = n / col +  (n % col == 0 ? 0 : 1);
        int matrix[][] = new int[n1][col];
        for (int ik = 0; ik < n1; ik++)
            for (int jk = 0; jk < col; jk++)
                matrix[ik][jk] = 0;
        for (int ik = 0; ik < n1; ik++) {
            for (int jk = 0; jk < col; jk++) {
                int i = ik + 1;
                int j = jk + 1;
                matrix[ik][jk] = ((i - 1) * col + j) * (i % 2) + (i * col + 1 - j) * ((i + 1) % 2);
            }
        }
        for (int ik = 0; ik < n1; ik++) {
            for (int jk = 0; jk < col; jk++) {
                System.out.printf(" %02d  ", matrix[ik][jk]);
            } System.out.println("\n");
        }
    }
}

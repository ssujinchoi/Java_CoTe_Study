import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += grid[i][j];
                colSum += grid[j][i];
            }
            if (max < rowSum) {
                max = rowSum;
            }
            if (max < colSum) {
                max = colSum;
            }
        }

        int diagSum1 = 0;
        int diagSum2 = 0;

        for (int i = 0; i < n; i++) {
            diagSum1 += grid[i][i];
            diagSum2 += grid[i][n - i - 1];
        }

        if (max < diagSum1) {
            max = diagSum1;
        }
        if (max < diagSum2) {
            max = diagSum2;
        }

        System.out.println(max);
    }

}

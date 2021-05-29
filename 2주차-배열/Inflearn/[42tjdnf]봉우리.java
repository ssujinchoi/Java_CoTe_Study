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

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (j == 0) {
                        if (grid[i][j] > grid[i + 1][j] && grid[i][j] > grid[i][j + 1]) count++;
                    } else if (j == n - 1) {
                        if (grid[i][j] > grid[i + 1][j] && grid[i][j] > grid[i][j - 1]) count++;
                    } else {
                        if (grid[i][j] > grid[i + 1][j] && grid[i][j] > grid[i][j - 1] && grid[i][j] > grid[i][j + 1]) count++;
                    }
                } else if (i == n - 1) {
                    if (j == 0) {
                        if (grid[i][j] > grid[i - 1][j] && grid[i][j] > grid[i][j + 1]) count++;
                    } else if (j == n - 1) {
                        if (grid[i][j] > grid[i - 1][j] && grid[i][j] > grid[i][j - 1]) count++;
                    } else {
                        if (grid[i][j] > grid[i - 1][j] && grid[i][j] > grid[i][j - 1] && grid[i][j] > grid[i][j + 1]) count++;
                    }
                } else {
                    if (j == 0) {
                        if (grid[i][j] > grid[i + 1][j] && grid[i][j] > grid[i - 1][j] && grid[i][j] > grid[i][j + 1]) count++;
                    } else if (j == n - 1) {
                        if (grid[i][j] > grid[i + 1][j] && grid[i][j] > grid[i - 1][j] && grid[i][j] > grid[i][j - 1]) count++;
                    } else {
                        if (grid[i][j] > grid[i + 1][j] && grid[i][j] > grid[i - 1][j] && grid[i][j] > grid[i][j + 1] && grid[i][j] > grid[i][j - 1]) count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

}

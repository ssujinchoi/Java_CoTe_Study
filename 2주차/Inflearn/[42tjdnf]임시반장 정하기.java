import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] classmate = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                classmate[i][j] = scanner.nextInt();
            }
        }

        boolean[][] isClassmate = new boolean[n][n];
        int[] classmateCount = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != k && classmate[i][j] == classmate[k][j]) {
                        isClassmate[i][k] = true;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isClassmate[i][j]) {
                    classmateCount[i]++;
                }
            }
        }
        int max = 0, maxPos = classmateCount[0];

        for (int i = 0; i < n; i++) {
            if (max < classmateCount[i]) {
                max = classmateCount[i];
                maxPos = i;
            }
        }

        System.out.println(maxPos + 1);
    }

}

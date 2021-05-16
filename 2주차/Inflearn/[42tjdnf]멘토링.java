import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] grade = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grade[i][j] = scanner.nextInt() - 1;
            }
        }

        int pair = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    boolean isPair = true;
                    for (int k = 0; k < m; k++) {
                        int iGrade = 0, jGrade = 0;
                        for (int l = 0; l < n; l++) {
                            if (grade[k][l] == i) {
                                iGrade = l;
                            }
                            if (grade[k][l] == j) {
                                jGrade = l;
                            }
                        }
                        if (iGrade > jGrade) {
                            isPair = false;
                            break;
                        }
                    }
                    if (isPair) {
                        pair++;
                    }
                }
            }
        }

        System.out.println(pair);
    }

}

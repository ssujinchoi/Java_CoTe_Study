import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int rank = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && score[i] < score[j]) {
                    rank++;
                }
            }
            System.out.print(rank + 1 + " ");
        }
    }

}

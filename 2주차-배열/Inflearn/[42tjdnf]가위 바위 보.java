import java.util.Scanner;

public class Main {
    private static char result(int infoA, int infoB) {
        if (infoA == infoB) return 'D';
        if (infoA < infoB) {
            if (infoB - infoA == 1) return 'B';
            else return 'A';
        } else {
            if (infoA - infoB == 1) return 'A';
            else return 'B';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] infoA = new int[n];
        int[] infoB = new int[n];

        for (int i = 0; i < n; i++) {
            infoA[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            infoB[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result(infoA[i], infoB[i]));
        }
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int contCount = 0, score = 0;

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();

            if (input == 1) {
                score += (++contCount);
            } else contCount = 0;
        }

        System.out.println(score);
    }

}

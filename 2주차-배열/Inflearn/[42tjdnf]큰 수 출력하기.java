import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int prev = scanner.nextInt();

        System.out.print(prev + " ");

        for (int i = 1; i < n; i++) {
            int next = scanner.nextInt();

            if (next > prev) {
                System.out.print(next + " ");
            }
            prev = next;
        }
        System.out.println();
    }

}

import java.util.Scanner;

public class Main {

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt((double) n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            for (int j = 0; j < input / 2; j++) {
                if (isPrime(input / 2 - j) && isPrime(input / 2 + j)) {
                    System.out.printf("%d %d\n", input / 2 - j, input / 2 + j);
                    break;
                }
            }
        }
    }

}

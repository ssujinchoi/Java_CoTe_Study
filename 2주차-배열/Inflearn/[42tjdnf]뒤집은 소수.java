import java.util.Scanner;

public class Main {

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int reverseNum(String numStr) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = numStr.length() - 1; i >= 0; i--) {
            stringBuilder.append(numStr.charAt(i));
        }

        return Integer.parseInt(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String input;

        for (int i = 0; i < n; i++) {
            input = scanner.next();
            int reverseNum = reverseNum(input);

            if (isPrime(reverseNum)) {
                System.out.print(reverseNum + " ");
            }
        }
        System.out.println();
    }

}

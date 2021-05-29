import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next().toLowerCase();

        for (int i = 0; i < (input.length() - 1) / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

}

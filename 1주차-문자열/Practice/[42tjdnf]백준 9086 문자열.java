import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            System.out.print(input.charAt(0));
            System.out.println(input.charAt(input.length() - 1));
        }
    }

}

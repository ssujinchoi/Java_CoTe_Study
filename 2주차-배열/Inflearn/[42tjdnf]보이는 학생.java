import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int start_height = scanner.nextInt();
        int count = 1;

        for (int i = 1; i < n; i++) {
            int current_height = scanner.nextInt();
            if (current_height > start_height) {
                count++;
                start_height = current_height;
            }
        }

        System.out.println(count);
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            int left = 0, right = 0;
            StringBuilder stringBuilder = new StringBuilder();

            String input = scanner.nextLine();

            while (right != input.length()) {

                char current = input.charAt(left);

                if (current == ' ') {
                    stringBuilder.append(current);
                    right++;
                } else {
                    while (input.charAt(right) != ' ') {
                        right++;
                        if (right == input.length()) {
                            right = input.length();
                            break;
                        }
                    }
                    for (int j = right - 1; j >= left; j--) {
                        stringBuilder.append(input.charAt(j));
                    }
                }
                left = right;
            }
            System.out.println(stringBuilder.toString());
        }
    }

}

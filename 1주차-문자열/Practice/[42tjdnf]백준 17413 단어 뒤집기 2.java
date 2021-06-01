import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        int left = 0, right = 0;

        String input = scanner.nextLine();

        while (right != input.length()) {

            char current = input.charAt(left);

            if (current == '<') {
                while (input.charAt(right) != '>') {
                    stringBuilder.append(input.charAt(right++));
                }
                stringBuilder.append(input.charAt(right++));
            } else if (current == ' ') {
                stringBuilder.append(current);
                right++;
            } else {
                while (input.charAt(right) != '<' && input.charAt(right) != ' ') {
                    right++;
                    if (right == input.length()) {
                        right = input.length();
                        break;
                    }
                }
                for (int i = right - 1; i >= left; i--) {
                    stringBuilder.append(input.charAt(i));
                }
            }
            left = right;
        }

        System.out.println(stringBuilder.toString());
    }

}

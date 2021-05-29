import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static boolean isPalindrome(String input) {
        String lowerInput = input.toLowerCase();

        for (int i = 0; i < (input.length() - 1) / 2; i++) {
            if (lowerInput.charAt(i) != lowerInput.charAt(input.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder letters = new StringBuilder();

        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            letters.append(matcher.group());
        }

        if (isPalindrome(letters.toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}

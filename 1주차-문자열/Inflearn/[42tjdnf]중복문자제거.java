import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean[] isLetterAlreadyExist = new boolean[26];
        StringBuilder result = new StringBuilder();

        String input = scanner.next();

        for (char c : input.toCharArray()) {
            if (!isLetterAlreadyExist[c - 'a']) {
                isLetterAlreadyExist[c - 'a'] = true;
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }

}

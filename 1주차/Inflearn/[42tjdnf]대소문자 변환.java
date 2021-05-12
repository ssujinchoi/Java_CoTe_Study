import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        StringBuilder reverse = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                reverse.append(Character.toString((char)(c - 'a' + 'A')));
            } else {
                reverse.append(Character.toString((char)(c - 'A' + 'a')));
            }
        }

        System.out.println(reverse.toString());
    }

}

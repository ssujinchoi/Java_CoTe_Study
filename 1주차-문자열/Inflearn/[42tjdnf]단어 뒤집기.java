import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {

            String word = scanner.next();
            StringBuilder reverse = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                reverse.append(Character.toString(word.charAt(word.length() - j - 1)));
            }

            System.out.println(reverse.toString());
        }

    }

}

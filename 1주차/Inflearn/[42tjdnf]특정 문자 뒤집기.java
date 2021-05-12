import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        StringBuilder letterBuffer = new StringBuilder();
        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterBuffer.append(c);
            }
        }

        String letterString = letterBuffer.toString();
        int idx = letterString.length() - 1;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                output.append(letterString.charAt(idx--));
            } else {
                output.append(c);
            }
        }

        System.out.println(output.toString());
    }

}

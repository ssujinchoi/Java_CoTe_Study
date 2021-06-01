import java.util.Scanner;

public class Main {

    private static char strToChar(String input) {
        int strNum = 0;

        for (char c : input.toCharArray()) {
            strNum *= 2;
            strNum += (c == '#' ? 1 : 0);
        }

        return (char)strNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        String input = scanner.next();

        for (int i = 0; i < size; i++) {
            System.out.print(strToChar(input.substring(7 * i, 7 * (i + 1))));
        }
        System.out.println();
    }

}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.next();
        String compare;

        while(scanner.hasNext()) {
            compare = scanner.next();
            if (compare.length() > answer.length()) {
                answer = compare;
            }
        }

        System.out.println(answer);
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String input = scanner.next();

        String numbers[] = input.split(",");

        for (String numStr : numbers) {
            sum += Integer.parseInt(numStr);
        }

        System.out.println(sum);
    }

}

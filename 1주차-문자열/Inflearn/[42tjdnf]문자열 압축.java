import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        StringBuilder output = new StringBuilder();
        char head = input.charAt(0);

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (head == input.charAt(i)) {
                count++;
            } else {
                output.append(head);
                output.append(count != 1 ? count : "");
                head = input.charAt(i);
                count = 1;
            }
        }
        output.append(head);
        output.append(count != 1 ? count : "");

        System.out.println(output.toString());
    }

}

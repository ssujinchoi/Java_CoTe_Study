import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next().toLowerCase();
        char alphabet = scanner.next().toLowerCase().charAt(0);
        int count = 0;

        for (char c : word.toCharArray()) {
            if (alphabet == c) {
                count++;
            }
        }

        System.out.println(count);
    }
  
}

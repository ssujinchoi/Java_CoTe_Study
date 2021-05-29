import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.next().toLowerCase().toCharArray();
        int[] count = new int[26];

        for (char c : input) {
            count[c - 'a']++;
        }

        int max = count[0], maxPos = 0;

        for (int i = 0; i < 26; i++) {
            if (max < count[i]) {
                max = count[i];
                maxPos = i;
            }
        }
        int maxCount = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == max) {
                maxCount++;
            }
        }
        if (maxCount > 1) {
            System.out.println("?");
        } else {
            System.out.println((char)(maxPos + 'A'));
        }
    }

}

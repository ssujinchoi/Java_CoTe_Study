import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        char t = scanner.next().charAt(0);
        ArrayList<Integer> pos = new ArrayList<Integer>();
        int recentPosIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                pos.add(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (i < pos.get(0)) {
                System.out.print(pos.get(0) - i);
            } else if (i >= pos.get(pos.size() - 1)){
                System.out.print(i - pos.get(pos.size() - 1));
            } else if (i >= pos.get(recentPosIndex + 1)) {
                recentPosIndex++;
                System.out.print(0);
            } else {
                int middlePoint = (pos.get(recentPosIndex) + pos.get(recentPosIndex + 1)) / 2;
                if (i <= middlePoint) {
                    System.out.print(i - pos.get(recentPosIndex));
                } else {
                    System.out.print(pos.get(recentPosIndex + 1) - i);
                }
            }
            System.out.print(" ");
        }

        System.out.println();
    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> primeList = new ArrayList<>();
        primeList.add(2);

        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;

            for (Integer c : primeList) {
                if (i % c == 0) {
                    isPrime = false;
                    break;
                }
                if (c >= Math.sqrt(i)) {
                    break;
                }
            }

            if(isPrime) {
                primeList.add(i);
            }
        }
        System.out.println(primeList.size());
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fibPrev = 1;
        int fibNext = 1;

        System.out.print("1 1 ");
        
	for (int i = 2; i < n; i++) {
            int temp = fibPrev;
            fibPrev = fibNext;
            fibNext += temp;
            System.out.print(fibNext + " ");
        }
        System.out.println();
    }

}

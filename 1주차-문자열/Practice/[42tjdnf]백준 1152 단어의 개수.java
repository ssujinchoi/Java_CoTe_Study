import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<String>(Arrays.asList(scanner.nextLine().trim().split(" ", 0)));
        input.removeAll(Arrays.asList(""));
        System.out.println(input.size());
    }

}

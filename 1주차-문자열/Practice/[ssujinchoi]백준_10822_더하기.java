import java.util.*;
import java.io.*;

// 숫자와 콤마로만 이루어진 문자열 S가 주어진다. 이때, S에 포함되어있는 자연수의 합을 구하는 프로그램을 작성하시오.
// S의 첫 문자와 마지막 문자는 항상 숫자이고, 콤마는 연속해서 주어지지 않는다. 주어지는 수는 항상 자연수이다. 문자열 S에 포함되어 있는 자연수의 합을 출력한다.
class BJ10822
{
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//
//		int sum = 0;
//
//		String[] arr = str.split(",");
//
//		for(String x : arr) {
//			sum += Integer.parseInt(x);
//		}
//		System.out.println(sum);
//	}

	public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), ",");

        int sum = 0;

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);

    }
}

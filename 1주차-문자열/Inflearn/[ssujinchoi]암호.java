import java.util.*;
import java.io.*;

/* 
1. 반복문안에서 substring으로 입력받은 문자열을 7개씩 끊어준다.
2. .replace()로 #은 1, *는 0으로 변환한다.
3. Integer.parseInt(s, 2)를 이용하면 2진수 string을 10진수로 바꾸어준다.
etc)Integer.parseInt(s, 8) - 8진수 string변수를 10진수로 바꿔줌.
4. 10진수로 변환한 숫자에 해당하는 문자로 변환해준다.
*/
class IFR1_12 {
	public String solution(int n, String s) {
		String answer = "";
		String tmp = "";
		
		for(int i=0; i<n; i++) {
			tmp = s.substring(0, 7);
			tmp = tmp
				.replace("#", "1")
				.replace("*", "0");
			int number = Integer.parseInt(tmp, 2);
			answer += (char)number;
			s = s.substring(7);
		}
		
		return answer;
	}
	public static void main(String[] args)  {
		IFR1_12 C = new IFR1_12();

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		String s = br.readLine();

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(C.solution(n, s));
	}
}


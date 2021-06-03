import java.util.*;
// 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
// 입력: 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 
// 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
// ACDKJFOWIEGHE -> AB
// O -> OO
/* 의사코드
문자열 인덱스로 접근해서 첫 값과 마지막 값을 출력한다.
*/
class BJ9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		int t = sc.nextInt();
		while(t-- > 0) {
			String str = sc.next();
			int n = str.length();
			sb.append(str.charAt(0));
			sb.append(str.charAt(n-1));
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

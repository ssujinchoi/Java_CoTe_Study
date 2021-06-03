import java.util.*;
// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
// 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
class OneTo7 {
	public String solution(String str) {
		String answer = "YES";
		// 1. StringBuilder().reverse()를 이용해 str을 뒤집고 tmp에 담아준 후 비교.
		// String tmp = new StringBuilder(str).reverse().toString();

		// 1-1. str과 tmp모두 대문자로 바꾼 후 equals()로 비교한다.
		// tmp = tmp.toUpperCase();
		// str = str.toUpperCase();
		// if(str.equals(tmp)) answer = "YES";

		// 1-2. equalsIgnoreCase()를 이용해 대/소문자로 변경하지 않고 비교한다.
		// if(str.equalsIgnoreCase(tmp)) answer = "YES";
		// else answer = "NO";
		
		// 2. for문을 사용해 str길이의 반만큼만 돌아서 str.charAt()으로 앞뒤를 비교한다.
		str = str.toUpperCase();
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
		}
		
		return answer;
	}
	public static void main(String[] args) 
	{
		OneTo7 C = new OneTo7();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(C.solution(str));
	}
}

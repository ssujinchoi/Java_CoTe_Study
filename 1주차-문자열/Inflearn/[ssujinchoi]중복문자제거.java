import java.util.*;
// 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
class OneTo6
{
	public String solution(String str) {
		String answer = "";

		for(int i = 0; i<str.length(); i++) {
			// System.out.println(str.charAt(i)  + " "+i+" "+str.indexOf(str.charAt(i))); // indexOf(--) -> --  에 하나만 적으면 첫 번째 위치만 반환한다.
			if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args) 
	{
		OneTo6 C = new OneTo6();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(C.solution(str));
	}
}

import java.util.*;

// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다. 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
// 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
class OneTo8 
{
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); // []안의^는 부정, 즉 대문자A-Z가 아니면 공백으로 replace하라
			
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) return "YES";

		return answer;
	}
	public static void main(String[] args) 
	{
		OneTo8 C = new OneTo8();

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(C.solution(str));
	}
}

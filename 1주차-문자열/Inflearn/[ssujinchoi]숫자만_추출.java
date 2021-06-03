import java.util.*;

// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다. 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
class OneTo9 {
	public int solution(String str) {
		String answer = "";

		for(char x : str.toCharArray()){
//			3. Character클래스의 isDigit()함수 이용 = 숫자인가 판단하는 함수
			if(Character.isDigit(x)) answer += x;
//			2. 문자를 char배열로 변환 후 ASCII코드를 사용해 자연수로 만들기 
//			if(x>=48 && x<=57) answer = answer*10+(x-48); 
		}
		

		/* 1. replaceAll로 문자만 지우고 int형으로 변환
		String tmp = str.replaceAll("[^0-9]", "");
		answer = Integer.parseInt(tmp);
		*/

		return Integer.parseInt(answer);
	}
	public static void main(String[] args) 
	{
		OneTo9 C = new OneTo9();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(C.solution(str));
	}
}

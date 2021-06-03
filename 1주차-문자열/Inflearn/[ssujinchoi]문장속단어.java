import java.util.*;

// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
class OneTo3
{
	public String solution(String str) {
		String answer = "";	
		int m = Integer.MIN_VALUE;
		String[] arr = str.split(" ");

		for(String x : arr) {
			if(x.length() > m) {
				m = x.length();
				answer = x;
			}
		}

		return answer;
	}

	public static void main(String[] args) 
	{
		OneTo3 C = new OneTo3();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(C.solution(str));
	}
}

import java.util.*;

// 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
class OneTo5 
{
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;

		while(lt < rt){
			if(!Character.isAlphabetic(s[lt])) { // 알파벳이 아닐 때 = 특수문자일 때
				lt++;
			} else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}

	public static void main(String[] args) 
	{
		OneTo5 C = new OneTo5();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(C.solution(str));
		
	}
}

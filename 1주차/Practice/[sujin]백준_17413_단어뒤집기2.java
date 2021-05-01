import java.util.*;

// 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다. 첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.
public class BJ17413 {
	public static void main(String[] args) 
	{
		String answer = "";
		boolean tag = false; // tag검사

		Stack<Character> st = new Stack<Character>();

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i); // str.charAt(i)를 변수화

			if(c == '<') { // 태그 시작시 스택상태 확인 후 스택에 담긴 문자를 출력
				tag = true;
				while(!st.isEmpty()) {
					answer += st.pop(); 
				}
				answer += c;
			} else if(c == '>') {
				tag = false;
				answer += c;
			} else if(tag) {
				answer += c;
			} else {
				if(c == ' ') {
					while(!st.isEmpty()) {
						answer += st.pop();
					}
					answer += c;
				} else {
					st.push(c);
				}
			}

		}
		
		while(!st.isEmpty()) {
			answer +=  st.pop();
		}
		System.out.println(answer);
	}
}

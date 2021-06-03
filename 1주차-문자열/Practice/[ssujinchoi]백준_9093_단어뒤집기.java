import java.util.*;
import java.io.*;
// 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램.  단, 단어의 순서는 바꿀 수 없고, 영어 알파벳으로만 이루어져 있다.
//입력: 첫째 줄에 테스트 케이스 개수T. 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
//출력: 각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
//I am happy today -> I ma yppah yadot
/* 의사코드
스택에 넣을 때 문자값이 공백이면 스택의 값을 pop해서 출력하고 공백을 추가한다. 개행문자는 공백이 아님으로 마지막에 스택에 남은 단어(문자)는 따로 pop해준다.
stringbuilder를 사용해 문장개수만큼 append한다.
*/
class BJ9093 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int t = Integer.parseInt(br.readLine());
		Stack<Character> st = new Stack<>();

		while(t > 0) {
			String str = br.readLine();
			for(char x : str.toCharArray()) {
				if(st.isEmpty()) st.push(x);
				else {
					if(x == ' ') {
						while(st.size() != 0) sb.append(st.pop());
						sb.append(x);
					}
					else st.push(x);
				}
			}
			while(!st.isEmpty()) sb.append(st.pop());
			sb.append("\n");
			--t;
		}
		System.out.println(sb);
	}
}

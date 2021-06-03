import java.util.*;

// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
class OneTo4
{
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();

		for(String x : str) {
			char[] s = x.toCharArray(); 
			int lt = 0, rt = s.length-1; // 직접 뒤집기
			while(lt<rt){
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s); // valueOf는 static로 선언된 클래스 메서드
			answer.add(tmp);
//			String sb = new StringBuilder(x).reverse().toString(); // reverse - 전체 뒤집기
//			answer.add(sb);
		}

		return answer;
	}


	public static void main(String[] args) 
	{
		OneTo4 C = new OneTo4();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 단어 몇개 입력할지...
		String[] str = new String[n];

		for(int i=0; i<n; i++){
			str[i] = sc.next();
		}

		for(String x : C.solution(n, str)) {
			System.out.println(x);
		}
	}
}

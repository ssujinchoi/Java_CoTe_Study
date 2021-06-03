import java.util.*;

class WordSearch {
	public int solution(String str, char a) {
		int answer = 0;
		str = str.toUpperCase();
		a = Character.toUpperCase(a);

		/*for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == a) answer++;
		}

		*/
		for(char x : str.toCharArray()) {
			if(x == a) answer++;
		}
		return answer;
	}

	public static void main(String[] args) 
	{
		WordSearch WS = new WordSearch();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char alphabet = sc.next().charAt(0);

		System.out.println(WS.solution(str, alphabet));
	}
}

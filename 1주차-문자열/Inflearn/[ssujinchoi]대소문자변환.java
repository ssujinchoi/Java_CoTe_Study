import java.util.*;

class UpperLow {
	public String solution(String str) {
		String answer = "";

		for(char x : str.toCharArray()) {
			if(Character.isUpperCase(x)) {
				answer += Character.toLowerCase(x);
			} else {
				answer += Character.toUpperCase(x);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		UpperLow  ul = new UpperLow();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(ul.solution(str));
		
	}
}

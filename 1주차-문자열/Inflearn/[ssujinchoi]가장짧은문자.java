import java.util.*;

class IFR1_10 {
	public int[] solution(String str, char t) {
		int[] answer = new int[str.length()];
		int d = 100;
	
		for(int i=0; i<str.length(); i++) {
			int s = str.charAt(i);
			if(s == t) {
				d = 0;
				answer[i] = d;
			} else {
				d++;
				answer[i] = d;
			}
		}
		d = 100;
		for(int i=str.length()-1; i>=0; i--) {
			int s = str.charAt(i);
			if(s == t) {
				d = 0;
			} else {
				d++;
				if(answer[i] > d) {
					answer[i] = d;
				}
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		IFR1_10 C = new IFR1_10();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char t = sc.next().charAt(0);
		for(int x : C.solution(str, t)) {
			System.out.print(x + " ");
		}
	}
}

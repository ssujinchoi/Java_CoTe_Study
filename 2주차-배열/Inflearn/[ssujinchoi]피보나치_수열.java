import java.util.*;

class IFR2_4 {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i=2; i<n; i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		return answer;
	}
	public static void main(String[] args) {
		IFR2_4 C = new IFR2_4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x : C.solution(n)) {
			System.out.print(x + " ");
		}
	}
}

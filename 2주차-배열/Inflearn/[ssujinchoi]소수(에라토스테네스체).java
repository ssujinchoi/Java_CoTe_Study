import java.util.*;

// 입력받은 자연수n까지의 소수개수를 구하라 (2<=n<=200,000) - 에라토스테네스 체
class IFR2_5 {
	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			if(arr[i] == 0) {
				answer++;
//				for(int j=i*i; j<=n; j+=i) {
//					arr[j]=1;
//				}

				for(int j=2; i*j<=n; j++) {
					arr[i*j]=1;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		IFR2_5 C = new IFR2_5();
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n <= 1) return;
		System.out.println(C.solution(n));
	}
}

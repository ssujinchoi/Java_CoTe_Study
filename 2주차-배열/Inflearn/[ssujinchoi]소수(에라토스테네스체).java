import java.util.*;

// �Է¹��� �ڿ���n������ �Ҽ������� ���϶� (2<=n<=200,000) - �����佺�׳׽� ü
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

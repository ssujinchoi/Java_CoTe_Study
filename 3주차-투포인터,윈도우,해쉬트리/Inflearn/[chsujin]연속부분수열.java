import java.util.*;

class IFR3_4 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0;
		int p1 = 0, p2 = 0;
		
		while(p2<n) { 
			sum += arr[p2++]; 
			if(sum == m) answer++;
			while(sum >= m) {
				sum -= arr[p1++];
				if(sum == m) answer++;		
			}
		}
		
		while(p1<n) {
			sum -= arr[p1++];
			if(sum == m) answer++;	
		}

		return answer;
	}
	public static void main(String[] args) {
		IFR3_4 C = new IFR3_4();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt(); 
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();

		System.out.println(C.solution(n, m, arr));
	}
}

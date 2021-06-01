import java.util.*;

class IFR3_5 {
	public int solution(int n, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		int range = (int)Math.ceil((double)n/2);

		for(int rt=0; rt<range; rt++) {
			sum += arr[rt];
			while (sum >= n) {
				if(sum == n) {
					answer++;
				}
				sum -= arr[lt++];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		IFR3_5 C = new IFR3_5();
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt(); 
		int[] arr=new int[n];
		for(int i=1; i<=n; i++){
			arr[i-1]=i;
		}
		
		System.out.print(C.solution(n, arr));
	}
}

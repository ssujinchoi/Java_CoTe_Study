import java.util.*;

class IFR3_6 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int lt = 0, cnt = 0;

		for(int rt=0; rt<n; rt++) {
//			if(answer < rt - lt + 1) answer = rt - lt + 1; // 틀린코드
			if(arr[rt] == 0) cnt++;
			while(cnt > k) {
				if(arr[lt++] == 0) cnt--;
			}
			if(answer < rt - lt + 1) answer = rt - lt + 1;
		}
		return answer;
	}
	public static void main(String[] args){
		IFR3_6 C = new IFR3_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();

		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		System.out.println(C.solution(n, k, arr));
	}
}

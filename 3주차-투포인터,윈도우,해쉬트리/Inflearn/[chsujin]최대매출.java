import java.util.*;
/*
의사코드
처음 생각한 방법(k값에 따라 중간에 더하는 값??을 정할 방법이 없었음...)
max값 설정 
start = 0, end = start + k, start++
시작과 끝을 세칸씩 고정시키고 시작을 +1씩 해주면 윈도우가 오른쪽으로 움직이면서 nowsum을 구한다.arr[start] + ??? + arr[end]
nowsum > max이면 nowsum = max(=여기선 answer)
*/
class IFR3_3 {
	public int solution(int k, int[] arr) {
		int answer = 0, nowsum = 0; // 여기서 answer은 max값
		
		for(int i=0; i<k; i++) {
			nowsum += arr[i];
		}
		answer = nowsum;

		for(int i=k; i<arr.length; i++) {
			nowsum += arr[i] - arr[i-k];
			answer = Math.max(answer, nowsum);
		}
			
		return answer;
	}
	public static void main(String[] args) {
		IFR3_3 C = new IFR3_3();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt(); // 몇 개씩 합산 할 것인가
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();

		System.out.println(C.solution(k, arr));
	}
}

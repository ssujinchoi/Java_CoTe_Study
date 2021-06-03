import java.util.*;
// 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성
class IFR2_2 {
	public int solution(int[] arr) {
		int answer = 1;
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		IFR2_2 C = new IFR2_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(C.solution(arr));
	}
}

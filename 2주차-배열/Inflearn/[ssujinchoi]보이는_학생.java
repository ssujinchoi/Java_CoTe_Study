import java.util.*;
// �������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ� �������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ�
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

import java.util.*;
/// 에라토스테네스의 체
// 1. 2부터 N까지 모든 정수를 적는다. 2. 아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
// 3. P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다. 4. 아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
// 5. N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.
//입력: 첫째 줄에 N과 K가 주어진다. (1 ≤ K < N, max(2, K) < N ≤ 1000)
//출력: 첫째 줄에 K번째 지워진 수를 출력한다. 2, 4, 6, 8, 10, 3, 9, 5, 7 순서대로 지워진다. 7번째 지워진 수는 9이다.
class BJ2960 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n+1];
	
		int order = 0;
		for(int p=2; p<=n; p++) {
			if(arr[p] == 0) {
				arr[p] = 1;
				order++;
				if(order == k) {
					System.out.println(p);
					break;
				}
				for(int j=p+p; j<=n; j=j+p) {
					if(arr[j] != 1) {
						arr[j] = 1;
						order++;
					}
					if(order == k) {
					System.out.println(j);
					break;
					}
				}
			}
		}
	}
}

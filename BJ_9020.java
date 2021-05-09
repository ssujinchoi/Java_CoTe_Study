package backjoon.one;

import java.util.Scanner;

// 이 문제에서 두 소수의 합의 경우의 수를 빠른 시간 내에 따지려면 미리 소수가 아닌 것들을 에라토스테네스의 체로 걸러내야 한다. (베르트랑
// 공준 문제(4948) 참고)
// 그 후에 소수이고, 차가 가장 적으며, 더했을 때 입력값을 만족시키는 두 수를 구한다. 이는 모든 경우의 수를 따져보지 않아도 가능한데
// 먼저 두 수를 n/2 로 둔다.
// 그리고 매 반복마다 하나는 감소, 하나는 증가시키며 소수임을 체크한다. 가장 먼저 조건을 만족하는 쌍이 골드바흐 파티션으로 출력되고
// 반복문을 탈출한다.

public class BJ_9020 {

	public static boolean isPrime(int num) {
		if (num == 0)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int a, b =0;
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			for (a = num / 2, b = num / 2;; a++, b--) {

				num = a + b;

				if (isPrime(a) && isPrime(b)) {

					System.out.println(b + " " + a);
					
					break;
				}
			}
		}
	}
}

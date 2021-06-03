import java.util.*;
// N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요. 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
// 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.

/*수도코드
1. main에서 입력할 개수와 숫자들을 입력받고, 배열에 담아 solution메서드로 보낸다.
2. 등수를 누적하는 cnt변수를 1로 초기화 <- 등수임으로 자기자신 한명은 기본으로 체크하고간다. ==> (수정)cnt변수를 둘 필요없이 answer배열에 i인덱스의 값을 바로 +1씩 증가시켜주면 된다. 어차피 점수 순서대로 등수가 입력되기때문에...
3. answer배열을 선언해 등수를 기록
4. 2중for문을 돌면서 배열의 i인덱스 값과 j인덱스 값을 비교
5. arr[i] >= arr[j] 이면 등수(answer[i])는 그대로, 그 외(작으면)에는 등수(answer[i])를 +1씩 해준다. 비교하는 점수의 값은 answer[i] = 1로 초기화.
*/
class IFR2_8 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];

		for(int i=0; i<n; i++) {
			answer[i] = 1;
			for(int j=0; j<n; j++) {
				if(arr[i] < arr[j]) answer[i]++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		IFR2_8 C = new IFR2_8();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();

		for(int x : C.solution(n, arr)) {
			System.out.print(x + " ");		
		}

	}
}

import java.util.Scanner;
  
class Main {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++) {
			answer[i] = 1;
			for(int j=0; j<n; j++) {
				if(arr[i] < arr[j]) {
					answer[i]++;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main C = new Main();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int x : C.solution(n, arr)) {
			System.out.print(x + " ");		
		}

	}
}
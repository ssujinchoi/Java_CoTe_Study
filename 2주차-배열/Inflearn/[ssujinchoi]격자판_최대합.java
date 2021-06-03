import java.util.*;
import java.io.*;
/* 수도코드
1. 입력받은 숫자를 2차원 배열에 담는다.
2. 2중for문을 사용해 1~n행, 1~n열 더한 값 구하기
3. 대각선 합은 1,1/ 2,2 이런식이므로 for문하나로 가능
4. 더한 값을 저장하는 변수를 지정하고, 한 사이클마다 Math.max()로 비교해서 큰값을 answer에 담는다.
*/
class IFR2_9 {
	public int solution(int n, int[][] grating) {
		int answer = 0;
		int tmp = 0;
		int columSum, rowSum;
		int croSum_1 = 0, croSum_2 = 0;

		// 대각선sum
		for(int i=0; i<n; i++) {
			croSum_1 += grating[i][i];
		}
		for(int i=n-1; i>=0; i--) {
			croSum_2 += grating[i][n-i-1];
		}
		tmp = Math.max(croSum_1, croSum_2);
		if(tmp > answer) answer = tmp;
                                                 
		// 행열 sum
		for(int i=0; i<n; i++) {
			rowSum = columSum =0;
			for(int j=0; j<n; j++) {
				rowSum += grating[i][j];
				columSum += grating[j][i];
			}
			tmp = Math.max(columSum, rowSum);
			if(tmp > answer) answer = tmp;
		}
	
		return answer;
	}

	public static void main(String[] args) throws IOException {
		IFR2_9 C = new IFR2_9();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][n];

		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(C.solution(n, arr));
	}
}

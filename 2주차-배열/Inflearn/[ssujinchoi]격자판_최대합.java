import java.util.*;
import java.io.*;
/* �����ڵ�
1. �Է¹��� ���ڸ� 2���� �迭�� ��´�.
2. 2��for���� ����� 1~n��, 1~n�� ���� �� ���ϱ�
3. �밢�� ���� 1,1/ 2,2 �̷����̹Ƿ� for���ϳ��� ����
4. ���� ���� �����ϴ� ������ �����ϰ�, �� ����Ŭ���� Math.max()�� ���ؼ� ū���� answer�� ��´�.
*/
class IFR2_9 {
	public int solution(int n, int[][] grating) {
		int answer = 0;
		int tmp = 0;
		int columSum, rowSum;
		int croSum_1 = 0, croSum_2 = 0;

		// �밢��sum
		for(int i=0; i<n; i++) {
			croSum_1 += grating[i][i];
		}
		for(int i=n-1; i>=0; i--) {
			croSum_2 += grating[i][n-i-1];
		}
		tmp = Math.max(croSum_1, croSum_2);
		if(tmp > answer) answer = tmp;
                                                 
		// �࿭ sum
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

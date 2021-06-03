import java.util.*;
import java.io.*;

// �Է¹��� ���ڸ� ����� �Ҽ������� �Ǻ��϶�. ����, 900 -> 9�� �ν�
class IFR2_6 
{
	public boolean isPrime(int n) { // �Ҽ����� �Ǵ��ϴ� �Լ�
		if(n==1) return false;
		for(int i=2; i<n; i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0; // �������� ���ڸ� ��� ����
			while(tmp>0) {
				res = res*10 + tmp%10;  
				tmp = tmp/10;
			}
			if(isPrime(res)) {
				answer.add(res);
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		IFR2_6 C = new IFR2_6();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int x : C.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}

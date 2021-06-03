import java.util.*;
import java.io.*;

// 입력받은 숫자를 뒤집어서 소수인지를 판별하라. 만약, 900 -> 9로 인식
class IFR2_6 
{
	public boolean isPrime(int n) { // 소수인지 판단하는 함수
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
			int res = 0; // 뒤집어진 숫자를 담는 변수
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

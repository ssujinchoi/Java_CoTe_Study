import java.util.*;
// N���� �л��� ���������� �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷��� �ۼ��ϼ���. ���� ������ �Էµ� ��� ���� ����� ���� ó���Ѵ�.
// ù �ٿ� N(3<=N<=100)�� �Էµǰ�, �� ��° �ٿ� ���������� �ǹ��ϴ� N���� ������ �Էµȴ�.

/*�����ڵ�
1. main���� �Է��� ������ ���ڵ��� �Է¹ް�, �迭�� ��� solution�޼���� ������.
2. ����� �����ϴ� cnt������ 1�� �ʱ�ȭ <- ��������� �ڱ��ڽ� �Ѹ��� �⺻���� üũ�ϰ���. ==> (����)cnt������ �� �ʿ���� answer�迭�� i�ε����� ���� �ٷ� +1�� ���������ָ� �ȴ�. ������ ���� ������� ����� �ԷµǱ⶧����...
3. answer�迭�� ������ ����� ���
4. 2��for���� ���鼭 �迭�� i�ε��� ���� j�ε��� ���� ��
5. arr[i] >= arr[j] �̸� ���(answer[i])�� �״��, �� ��(������)���� ���(answer[i])�� +1�� ���ش�. ���ϴ� ������ ���� answer[i] = 1�� �ʱ�ȭ.
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
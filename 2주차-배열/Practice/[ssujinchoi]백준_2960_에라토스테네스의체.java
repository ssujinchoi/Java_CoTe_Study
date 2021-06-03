import java.util.*;
/// �����佺�׳׽��� ü
// 1. 2���� N���� ��� ������ ���´�. 2. ���� ������ ���� �� �� ���� ���� ���� ã�´�. �̰��� P��� �ϰ�, �� ���� �Ҽ��̴�.
// 3. P�� �����, ���� ������ ���� P�� ����� ũ�� ������� �����. 4. ���� ��� ���� ������ �ʾҴٸ�, �ٽ� 2�� �ܰ�� ����.
// 5. N, K�� �־����� ��, K��° ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է�: ù° �ٿ� N�� K�� �־�����. (1 �� K < N, max(2, K) < N �� 1000)
//���: ù° �ٿ� K��° ������ ���� ����Ѵ�. 2, 4, 6, 8, 10, 3, 9, 5, 7 ������� ��������. 7��° ������ ���� 9�̴�.
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

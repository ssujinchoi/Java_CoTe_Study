import java.util.*;
// ���ڿ��� �Է����� �ָ� ���ڿ��� ù ���ڿ� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �Է�: ù �ٿ��� �׽�Ʈ ���̽��� ���� T(1 �� T �� 10)�� �־�����. 
// �� �׽�Ʈ ���̽��� �� �ٿ� �ϳ��� ���ڿ��� �־�����. ���ڿ��� ���ĺ� A~Z �빮�ڷ� �̷������ ���ĺ� ���̿� ������ ������ ���ڿ��� ���̴� 1000���� �۴�.
// ACDKJFOWIEGHE -> AB
// O -> OO
/* �ǻ��ڵ�
���ڿ� �ε����� �����ؼ� ù ���� ������ ���� ����Ѵ�.
*/
class BJ9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		int t = sc.nextInt();
		while(t-- > 0) {
			String str = sc.next();
			int n = str.length();
			sb.append(str.charAt(0));
			sb.append(str.charAt(n-1));
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

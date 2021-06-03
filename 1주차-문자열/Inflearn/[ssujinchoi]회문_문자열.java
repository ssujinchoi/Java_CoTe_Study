import java.util.*;
// �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
// ���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
class OneTo7 {
	public String solution(String str) {
		String answer = "YES";
		// 1. StringBuilder().reverse()�� �̿��� str�� ������ tmp�� ����� �� ��.
		// String tmp = new StringBuilder(str).reverse().toString();

		// 1-1. str�� tmp��� �빮�ڷ� �ٲ� �� equals()�� ���Ѵ�.
		// tmp = tmp.toUpperCase();
		// str = str.toUpperCase();
		// if(str.equals(tmp)) answer = "YES";

		// 1-2. equalsIgnoreCase()�� �̿��� ��/�ҹ��ڷ� �������� �ʰ� ���Ѵ�.
		// if(str.equalsIgnoreCase(tmp)) answer = "YES";
		// else answer = "NO";
		
		// 2. for���� ����� str������ �ݸ�ŭ�� ���Ƽ� str.charAt()���� �յڸ� ���Ѵ�.
		str = str.toUpperCase();
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
		}
		
		return answer;
	}
	public static void main(String[] args) 
	{
		OneTo7 C = new OneTo7();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(C.solution(str));
	}
}

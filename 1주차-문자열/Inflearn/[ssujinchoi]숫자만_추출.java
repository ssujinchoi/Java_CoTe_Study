import java.util.*;

// ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�. ���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
class OneTo9 {
	public int solution(String str) {
		String answer = "";

		for(char x : str.toCharArray()){
//			3. CharacterŬ������ isDigit()�Լ� �̿� = �����ΰ� �Ǵ��ϴ� �Լ�
			if(Character.isDigit(x)) answer += x;
//			2. ���ڸ� char�迭�� ��ȯ �� ASCII�ڵ带 ����� �ڿ����� ����� 
//			if(x>=48 && x<=57) answer = answer*10+(x-48); 
		}
		

		/* 1. replaceAll�� ���ڸ� ����� int������ ��ȯ
		String tmp = str.replaceAll("[^0-9]", "");
		answer = Integer.parseInt(tmp);
		*/

		return Integer.parseInt(answer);
	}
	public static void main(String[] args) 
	{
		OneTo9 C = new OneTo9();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(C.solution(str));
	}
}

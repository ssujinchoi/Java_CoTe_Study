import java.util.*;
// �ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
class OneTo6
{
	public String solution(String str) {
		String answer = "";

		for(int i = 0; i<str.length(); i++) {
			// System.out.println(str.charAt(i)  + " "+i+" "+str.indexOf(str.charAt(i))); // indexOf(--) -> --  �� �ϳ��� ������ ù ��° ��ġ�� ��ȯ�Ѵ�.
			if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args) 
	{
		OneTo6 C = new OneTo6();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(C.solution(str));
	}
}

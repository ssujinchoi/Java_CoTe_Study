import java.util.*;

// �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�. ���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
// ���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
class OneTo8 
{
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); // []����^�� ����, �� �빮��A-Z�� �ƴϸ� �������� replace�϶�
			
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) return "YES";

		return answer;
	}
	public static void main(String[] args) 
	{
		OneTo8 C = new OneTo8();

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(C.solution(str));
	}
}

import java.util.*;

// �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
class OneTo3
{
	public String solution(String str) {
		String answer = "";	
		int m = Integer.MIN_VALUE;
		String[] arr = str.split(" ");

		for(String x : arr) {
			if(x.length() > m) {
				m = x.length();
				answer = x;
			}
		}

		return answer;
	}

	public static void main(String[] args) 
	{
		OneTo3 C = new OneTo3();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(C.solution(str));
	}
}

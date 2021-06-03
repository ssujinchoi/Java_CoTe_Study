import java.util.*;

// N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
class OneTo4
{
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();

		for(String x : str) {
			char[] s = x.toCharArray(); 
			int lt = 0, rt = s.length-1; // ���� ������
			while(lt<rt){
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s); // valueOf�� static�� ����� Ŭ���� �޼���
			answer.add(tmp);
//			String sb = new StringBuilder(x).reverse().toString(); // reverse - ��ü ������
//			answer.add(sb);
		}

		return answer;
	}


	public static void main(String[] args) 
	{
		OneTo4 C = new OneTo4();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // �ܾ� � �Է�����...
		String[] str = new String[n];

		for(int i=0; i<n; i++){
			str[i] = sc.next();
		}

		for(String x : C.solution(n, str)) {
			System.out.println(x);
		}
	}
}

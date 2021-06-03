import java.util.*;
import java.io.*;
// ������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷�.  ��, �ܾ��� ������ �ٲ� �� ����, ���� ���ĺ����θ� �̷���� �ִ�.
//�Է�: ù° �ٿ� �׽�Ʈ ���̽� ����T. ������ �ϳ� �־�����. �ܾ��� ���̴� �ִ� 20, ������ ���̴� �ִ� 1000�̴�. �ܾ�� �ܾ� ���̿��� ������ �ϳ� �ִ�.
//���: �� �׽�Ʈ ���̽��� ���ؼ�, �Է����� �־��� ������ �ܾ ��� ������ ����Ѵ�.
//I am happy today -> I ma yppah yadot
/* �ǻ��ڵ�
���ÿ� ���� �� ���ڰ��� �����̸� ������ ���� pop�ؼ� ����ϰ� ������ �߰��Ѵ�. ���๮�ڴ� ������ �ƴ����� �������� ���ÿ� ���� �ܾ�(����)�� ���� pop���ش�.
stringbuilder�� ����� ���尳����ŭ append�Ѵ�.
*/
class BJ9093 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int t = Integer.parseInt(br.readLine());
		Stack<Character> st = new Stack<>();

		while(t > 0) {
			String str = br.readLine();
			for(char x : str.toCharArray()) {
				if(st.isEmpty()) st.push(x);
				else {
					if(x == ' ') {
						while(st.size() != 0) sb.append(st.pop());
						sb.append(x);
					}
					else st.push(x);
				}
			}
			while(!st.isEmpty()) sb.append(st.pop());
			sb.append("\n");
			--t;
		}
		System.out.println(sb);
	}
}

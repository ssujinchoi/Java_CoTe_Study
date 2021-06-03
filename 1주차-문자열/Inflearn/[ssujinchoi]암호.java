import java.util.*;
import java.io.*;

/* 
1. �ݺ����ȿ��� substring���� �Է¹��� ���ڿ��� 7���� �����ش�.
2. .replace()�� #�� 1, *�� 0���� ��ȯ�Ѵ�.
3. Integer.parseInt(s, 2)�� �̿��ϸ� 2���� string�� 10������ �ٲپ��ش�.
etc)Integer.parseInt(s, 8) - 8���� string������ 10������ �ٲ���.
4. 10������ ��ȯ�� ���ڿ� �ش��ϴ� ���ڷ� ��ȯ���ش�.
*/
class IFR1_12 {
	public String solution(int n, String s) {
		String answer = "";
		String tmp = "";
		
		for(int i=0; i<n; i++) {
			tmp = s.substring(0, 7);
			tmp = tmp
				.replace("#", "1")
				.replace("*", "0");
			int number = Integer.parseInt(tmp, 2);
			answer += (char)number;
			s = s.substring(7);
		}
		
		return answer;
	}
	public static void main(String[] args)  {
		IFR1_12 C = new IFR1_12();

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		String s = br.readLine();

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(C.solution(n, s));
	}
}


import java.util.*;
import java.io.*;

class IFR1_11 {
	public String solution(String str) {
		String answer = "";
		str += "";
		int[] arr = new int[26];

		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-65]++;
		}
		System.out.println(str.length());
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				continue;
			} else if(arr[str.charAt(i)-65] == 1) {
				answer += str.charAt(i);
			} else if(str.charAt(i+1) == '') { // 이 부분에서 else without if 오류가 남...
				answer += str.charAt(i);
				break;
			} else {
				answer += str.charAt(i) + String.valueOf(arr[str.charAt(i)-65]);
			}
		}
			
		return answer;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		IFR1_11 C = new IFR1_11();
		System.out.println(C.solution(str));
	}
}

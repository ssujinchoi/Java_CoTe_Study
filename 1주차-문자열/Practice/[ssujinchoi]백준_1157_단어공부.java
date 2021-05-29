import java.util.*;
import java.io.*;
// https://st-lab.tistory.com/64
// 해시맵으로도 풀어보자! 
// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
// 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
public class BJ1157 {
    public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in); // 스캐너의 경우 사용하기 편리하지만 속도가 느리다는 치명적인 단점이 있다. 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더는 한줄을 통째로 입력받는 방법으로 이것저것 선언해야할 것이 많아 번거롭지만 비교적 빠를 수 있다는 장점이 있다.
		String str = br.readLine();
		str = str.toUpperCase(); 

		int[] arr = new int[26]; 
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i) - 65]++; // A -65-65 = 0, B-66-65 = 1, C-67... , A-Z = 26개
		}

		int max = Integer.MIN_VALUE;
		char answer = '\u0000';
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) { // 해당인덱스의 값이 MAX보다 크면 그 값을 MAX로 바꿈
				max = arr[i];
				answer = (char)(i + 65); // A=0+65, B=1+65, C=2+65...
			} else if(arr[i] == max){
				answer = '?';
			}
		}
		System.out.println(answer);
    }
}
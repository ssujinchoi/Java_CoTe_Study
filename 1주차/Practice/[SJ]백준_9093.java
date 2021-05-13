package backjoon.one;

import java.util.Scanner;
import java.util.Stack;

public class BJ_9093 {

	public static void main(String[] args) {
// stack을 이용한 풀이....시간 초과
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			String arr = sc.nextLine() + " ";

			for (char s : arr.toCharArray()) {

				if (Character.isAlphabetic(s))
					stack.push(s);

				else {
					while (!stack.isEmpty())
						System.out.print(stack.pop());

					System.out.print(" ");
				}
			}
		}
	}
}

// StringBuffer의 reverse()를 사용한 방법

//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		
//		sc.nextLine();// sc.nextInt() 사용후 sc.nextLine()를 사용하게 되면 sc.nextInt()에서 입력된 값이 sc.nextLine()에 입력된 값에 포함되기 때문에 이 문제를 해결하기 위한 방법으로 sc.nextLine();를 넣어준다.
//		
//		//String[] arr = new String[n];
//		
//		for(int i=0; i<n; i++) {
//			
//			String[] arr = sc.nextLine().split(" ");
//		
//			int c=arr.length;
//		
//			for(int j=0; j<c; j++) {
//				
//				String text = arr[j];
//				
//				StringBuffer sb = new StringBuffer(text);
//				
//				sb.reverse();
//				
//				System.out.print(sb+" ");
//			}
//		}
//	}
//}

package backjoon.one;

import java.util.Scanner;

public class BJ_9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		
		for(int i=0; i<n; i++) {
			char[] text = sc.next().toCharArray();
			String a=String.valueOf(text[0]);
			String b=String.valueOf(text[text.length-1]);
			
			arr[i]=a.concat(b);
		}
		
		for(String s :arr)
		System.out.println(s);
	}
}

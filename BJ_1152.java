package backjoon.one;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_1152 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(text);
	
		System.out.println(st.countTokens());
	
	}

}
package backjoon.one;

import java.util.Scanner;

public class BJ_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String textarr = sc.next().toUpperCase();
		
		int[] count = new int[26];
		
		int max = -1;
		char maxchar='?';
		
		for(int i=0; i<textarr.length(); i++) {
			
			int cal = count[textarr.charAt(i)-65];
			
			count[textarr.charAt(i)-65]++;
				if(max<cal) {
					max=cal;
					maxchar = textarr.charAt(i);
				}else if(max==cal) {
					maxchar = '?';
				}
		}	
			System.out.println(maxchar);
	}
}


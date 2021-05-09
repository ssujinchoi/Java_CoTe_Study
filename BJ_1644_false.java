package backjoon.one;

import java.util.Scanner;

public class BJ_1644_false {
	
	public boolean isPrime(int num) {
		if(num==0) return false;
		for(int i=2; i<num; i++) {
			if(num%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int max=4000000;
		
		

	}

}

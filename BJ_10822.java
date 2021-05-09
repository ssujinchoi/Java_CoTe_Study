package backjoon.one;

import java.util.Scanner;

public class BJ_10822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		String[] lines = line.split(",");
		
		int sum = 0;
		for(int i=0; i<lines.length; i++) {
			
			sum+= Integer.parseInt(lines[i]);
		}
		System.out.println(sum);
	}
}

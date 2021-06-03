import java.util.*;
import java.io.*;

class BJ1152 {
	public static void main(String[] args) throws IOException {
		int answer = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		if(str.length() == 0) System.out.print("0");
		else {
			for(char x : str.toCharArray()) if(x == ' ') answer++;
			System.out.print(answer+1);
		}
	}
}

package backjoon.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BJ_17413 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] arr = (br.readLine()+"\n").toCharArray();

		boolean isTag = false;
		
		Stack<Character> st = new Stack<>();
		isTag=false;
		
		for(int i = 0; i<arr.length; i++) {
			
			char c=arr[i];
			
			if(c=='<') isTag=true;
			
			if(isTag || c==' ' || c=='\n') {
				while(!st.isEmpty()) bw.write(st.pop());
				if(c != '\n') bw.write(c); 
				
			}else {
				st.push(c);
			}
			if(c=='>') isTag=false;
		}
		bw.flush();
	}
}

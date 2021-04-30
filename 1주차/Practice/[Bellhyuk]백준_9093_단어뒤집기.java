package practice;

import java.util.*;
import java.io.*;
/*
<Problem> - 단어 뒤집기, 9093번
문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오.
단, 단어의 순서는 바꿀 수 없다.
단어는 영어 알파벳으로만 이루어져 있다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다.
단어의 길이는 최대 20, 문장의 길이는 최대 1000이다.
단어와 단어 사이에는 공백이 하나 있다.

출력
각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
*/
/**
 * My code
 * @author Bellhyuk
 * @date '21.04.27.
 * 
 * <의사코드>
 * 그냥 뒤집으면 된다. -> stack 사용
 */
/*class Main3 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    Stack<Character> st = new Stack<>();
    int cnt = Integer.parseInt(br.readLine());
    while(cnt-->0) {
      String str = br.readLine();
      for(int i=0; i<str.length(); i++) {
        char c = str.charAt(i);
        if(c==' ') {
          while(!st.isEmpty()) sb.append(st.pop());
          sb.append(c);
        }
        else st.push(c);
      }
      while(!st.isEmpty()) sb.append(st.pop());
      sb.append('\n');
    }
    System.out.println(sb.toString());
  }
}*/
/**
 * Best Coding(코드도 적당히 짧고 메모리와 시간이 작은 것을 중심으로)
 * @author sonic247897
 * 
 * BufferdWriter와의 차이일지는 테스트 해봐야겠지만 대체적으로 Stack 클래스를 쓰기보다 배열을 통해 stack 알고리즘을 구현하는 것이
 * 불필요한 계산을 덜 하기 떄문에 더 빠른 계산을 보여주는 듯 하다.
 */
public class Main {
  public static void main(String[] args) throws Exception {
      char[] stack = new char[20];
      int top=0;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int n = Integer.parseInt(br.readLine());
      for(int i=0; i<n; ++i) {
          int c;
          while(true) {
              c = br.read();
              // 띄어쓰기 만나면 출력
              if(c == ' ' || c == '\n') {
                  while(top != 0) {
                      bw.write(stack[--top]);
                  }
                  // 스택 출력 후에 띄어쓰기랑 뉴라인 버퍼에 저장
                  if(c == ' ') bw.write(' ');
                  if(c == '\n') {
                      bw.write('\n'); 
                      break;
                  }
              } else if(c == '\r') {
                  // @ 윈도우에서 개행은 캐리지리턴(CRLF, \r\n)이다!
              }else {
                  // 스택에 띄어쓰기, 뉴라인 전부 넣으면 띄어쓰기부터 시작함(스택)
                  stack[top++] = (char)c;
              }
              // System.out.println((char)c + ":" + c); // => 결과: 문장 끝에 13
          }
      }
      bw.flush();
  }
}

package practice;

import java.util.*;
import java.io.*;
/*
<Problem> - 단어 뒤집기2 17413번
문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
1. 알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
2. 문자열의 시작과 끝은 공백이 아니다.
3. '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.
단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다.
태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.

입력
첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.

출력
첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.
*/
/**
 * My code
 * @author Bellhyuk
 * @date '21.04.27.
 * 
 * <의사코드>
 * 단어만 뒤집기
 * 태그에 감싸져 있는 단어는 무시
 * 
 * 공백, '<'을 기준으로 단어 구분
 * 
 */

//스택 알고리즘을 사용하여 문제를 풀어보자.
//연산이 많은 경우 String += 를 통한 계산은 시간을 상당히 많이 잡아먹기 떄문에
//StringBuilder를 적극적으로 활용해주자.
//답을 보고 다시 풀었다.. 나중에라도 꼭 다시 풀어봐야할 문제라고 생각한다.
class Main{
  public static void main(String[] args) throws Exception {
    Stack<Character> stack = new Stack<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str = br.readLine();
    boolean flag = false;//태그 밖 순서 뒤집기 false, 태그 안 순서 그대로 true
    for(int i=0; i<str.length(); i++) {
      char c = str.charAt(i);
      if(c=='<') flag=true;
      if(flag || c==' ') {
        while(!stack.isEmpty()) sb.append(stack.pop());
        sb.append(c);
      }else stack.push(c);
      if(c=='>') flag=false;
    }
    while(!stack.isEmpty()) sb.append(stack.pop());
    System.out.println(sb.toString());
  }
}

//TimeOver
/*class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    StringBuilder sb = new StringBuilder();
    String answer="";
    boolean ch = false;
    for(int i=0; i<str.length(); i++) {
      char s = str.charAt(i);
      if(s=='<') {
        if(ch==false) {
          answer += sb.reverse();
          sb.setLength(0);
        }
        answer += s;
        ch = true;
      }else if(s=='>') {
        answer += s;
        ch = false;
      }else if(s==' ') {
        if(ch==false) {
          answer += sb.reverse();
          sb.setLength(0);
        }
        answer += s;
      }
      else {
        if(ch==true) answer+=s;
        else sb.append(s);
      }
    }
    if(sb!=null) answer += sb.reverse();
    System.out.println(answer);
  }
}*/

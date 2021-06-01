import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.11.
 */
//인프런 Section 5-2 괄호문자제거
/*
의사코드
입력 문자열을 받고 해당 문자열 내 소괄호 사이에 존재하는 문자를 모두 제거하고 남은 문자만 출력
  */
//강사풀이
class Solution1{
  public String solution(String str) {
    String answer = "";
    Stack<Character> stack = new Stack<>();
    for(char x : str.toCharArray()){
      if(x==')'){
        while(stack.pop()!='(');
      }
      else stack.push(x);
    }
    for (int i = 0; i < stack.size(); i++) answer+=stack.get(i);
    return answer;
  }
}
//내 풀이
class Solution{
  public String solution(String str) {
    StringBuilder sb = new StringBuilder();
    Stack<Character> stack = new Stack<>();
    for(char c : str.toCharArray()){
      if(c == '(') stack.push(c);
      else if(c == ')'){
        if(stack.isEmpty()) continue;
        stack.pop();
      }
      else{
        if(stack.isEmpty()) sb.append(c);
      }
    }
    return sb.toString();
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Solution1 s = new Solution1();
    String str = sc.nextLine();
    System.out.println(s.solution(str));
  }
}

import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.11.
 */
//인프런 Section 5-1 올바른 괄호
/*
의사코드
괄호처리가 올바르게 마무리 되었는지 확인
stack을 활용하여 (이 들어가면 push, )이 입력되면 pop해서 stack size가 0이 아니면 NO 0이면 YES
  */
class Solution{
  public String solution(String str) {
    String answer = "NO";
    Stack<Character> stack = new Stack<>();
    for(char c : str.toCharArray()){
      if(c == '(') stack.push(c);
      if(c == ')'){
        if(stack.isEmpty()) return answer;
        stack.pop();
      }
    }
    if(stack.isEmpty()) answer="YES";
    return answer;
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    String str = sc.nextLine();
    System.out.println(s.solution(str));
  }
}

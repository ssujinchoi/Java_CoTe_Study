import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.06.01.
 */
//인프런 Section 5-4 후위식 연산(prefix)
/*
후위연산식
우리가 흔히 쓰는 표기식은 중위표기식으로 두 개의 피연산자 가운데 이항연산자를 사용하는 방법
이는 컴퓨터가 수식을 계산하기에는 매우 불편
이에 Stack을 활용할 수 있는 후위연산식을 통해 컴퓨터의 연산을 용이하게 만듦.
  */
//내 풀이
class Solution{
  public int solution(String str) {
    Stack<Integer> stack = new Stack<Integer>();
    for(char c:str.toCharArray()){
      if(c >= '0' && c<='9'){
        stack.push(c-'0');
      }
      else{
        int b = stack.pop();
        int a = stack.pop();
        switch(c){
          case '+':
            stack.push(a+b);
            break;
          case '-':
            stack.push(a-b);
            break;
          case '*':
            stack.push(a*b);
            break;
          case '/':
            stack.push(a/b);
            break;
        }
      }
    }
    return stack.pop();
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Solution s = new Solution();
    System.out.print(s.solution(str));
  }
}

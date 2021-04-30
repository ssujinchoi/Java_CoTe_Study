import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.04.30.
 */
//백준_9086_문자열
/*
문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
 */
class Solution {
  public String solution(String s){
    StringBuilder sb = new StringBuilder();
    String f = s.substring(0,1);
    String e = s.substring(s.length()-1);
    sb.append(f).append(e).append('\n');
    return sb.toString();
  }
}

public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int test = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < test; i++) {
      String str = sc.nextLine();
      sb.append(s.solution(str));
    }
    System.out.print(sb.toString());
  }
}

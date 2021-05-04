import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.01.
 */
//프로그래머스_음양더하기
/*
어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
실제 정수들의 합을 구하여 return

// 간단해서 풀이 생략
  */

class Solution {
  public int solution(int[] abs, boolean[] sign) {
    int i=0, sum=0;
    for(boolean s : sign){
      if(s) sum+=abs[i++];
      else sum-=abs[i++];
    }
    return sum;
  }
}
public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    int[] absoluties = {4,7,12};
    boolean[] signs = {true,false,true};
    System.out.println(s.solution(absoluties, signs));
  }
}

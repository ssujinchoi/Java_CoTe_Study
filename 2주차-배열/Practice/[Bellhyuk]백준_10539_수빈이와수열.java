import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.01.
 */
//수빈이와 수열
/*
먼저, 정수 수열 A를 쓴다.
그리고 그 아래에 정수 수열 A의 해당 항까지의 평균값을 그 항으로 하는 정수 수열 B를 쓴다.

예를 들어, 수열 A가 1, 3, 2, 6, 8이라면,
수열 B는 1/1, (1+3)/2, (1+3+2)/3, (1+3+2+6)/4, (1+3+2+6+8)/5, 즉, 1, 2, 2, 3, 4가 된다.

수열 B가 주어질 때, 수빈이의 규칙에 따른 수열 A는 뭘까?

입력
첫째 줄에는 수열 B의 길이만큼 정수 N(1 ≤ N ≤ 100)이 주어지고, 둘째 줄에는 수열 Bi를 이루는 N개의 정수가 주어진다

출력
첫째 줄에는 수열 A를 이루는 N개의 정수를 출력한다. (1 ≤ Ai ≤ 109)
  */

class Solution {
  public String solution(int[] arr) {
    //수열 B를 바탕으로 수열 A를 추축해내는 것
    StringBuilder sb = new StringBuilder();
    int i=1;
    int sum=0, num=0;
    for(int a : arr){
      if(i==1) num = a;
      else num = a*i - sum;
      sb.append(num).append(" ");
      i++;
      sum += num;
    }
    return sb.toString();
  }
}
public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    Scanner sc = new Scanner(System.in);
    int len = Integer.parseInt(sc.nextLine());
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println(s.solution(arr));
  }
}

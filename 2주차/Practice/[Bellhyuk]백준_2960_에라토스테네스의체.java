import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.01.
 */
//백준_2960_에라토스테네스의 체
/*
에라토스테네스의 체 알고리즘
1. 2부터 N까지 모든 정수를 적는다.
2. 아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
3. P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
4. 아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ K < N, max(2, K) < N ≤ 1000)

출력
첫째 줄에 K번째 지워진 수를 출력한다.

의사코드
에라토스테네스 체로 소수가 아닌 값을 체크하되 K번째 체크된 값을 구하면 된다.
  */

class Solution {
  public int solution(int n, int k) {
    int[] check = new int[n+1]; //조건에서 N의 최대는 1000
    int cnt = 0, answer=0;
    for (int i = 2; i<=check.length-1; i++) {
      if(check[i]>=1) continue;
      for (int j = i; j<=check.length-1; j+=i) {
        check[j]++;
        if(check[j]==1 && ++cnt == k){
          answer=j;
          break;
        }
      }
    }
    return answer;
  }
}
public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    System.out.println(s.solution(n, k));
  }
}

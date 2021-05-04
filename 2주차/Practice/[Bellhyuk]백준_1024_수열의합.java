import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.01.
 */
//백준_1024_수열의합
/*
N과 L이 주어질 때, 합이 N이면서,
길이가 적어도 L인 가장 짧은 연속된 음이 아닌 정수 리스트를 구하는 프로그램을 작성하시오.

입력
N<=1000000000, 2<=L<=100
출력
리스트의 길이가 100보다 작거나 같으면 연속된 수를 공백으로 구분하여 출력
100보다 크거나 그러한 수열이 없으면 -1 출력

//문제를 어떻게 풀지몰라 힌트를 참고했습니다.

의사코드
적어도 L와 같거나 큰 사이즈의 리스트
18, 2가 주어진 경우
리스트 길이가 2와 같거나 커야하므로
18 9 9 -> 연속 x
18 5 6 7 -> 연속 o

수열의 시작 직전인 임의의 x에 대해 N=(x+1)+...+(x+L)로 정의 가능
따라서 N= L*((x+1)+(x+L))/2로 정의 가능
-> x * L = N - L*(L+1)/2
즉 N - L*(L+1)/2가 L로 나눠 떨어지는 시점에서 x+1부터 x+L까지의 리스트를 출력하면 된다.
  */

class Solution {
  public String solution(int n, int l) {
    StringBuilder sb = new StringBuilder();
    for (int i = l; i <= 100; i++) {
      int num = n-(i*(i+1)/2);
      if(num % i==0){
        int x = num/i +1;
        if(x>=0){
          for (int j = 0; j < i; j++) {
            sb.append(x+j).append(" ");
          }
          return sb.toString();
        }
      }
    }
    return "-1";
  }
}
public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    System.out.println(s.solution(n, l));
  }
}

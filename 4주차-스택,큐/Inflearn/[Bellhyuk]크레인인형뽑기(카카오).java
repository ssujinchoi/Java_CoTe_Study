import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.06.01.
 */
//인프런 Section 5-3 크레인 인형뽑기(카카오)
/*
의사코드
이중배열을 통해 칸을 만들어주고 stack으로 저장하면서 하나씩 넣고 빼주는 것을 반복하자.
  */
//내 풀이
class Solution{
  public int solution(int[][] arr, int[] mvs) {
    Stack<Integer> stack = new Stack<Integer>();
    int answer = 0;
    for(int num : mvs){
      for (int i = 0; i < n; i++) {
        int pick = arr[i][num-1];
        if(pick!=0){
          if(stack.isEmpty() || stack.peek()!=pick) stack.push(pick);
          else{
            stack.pop();
            answer+=2;
          }
          arr[i][num-1]=0;
          break;
        }
      }
    }
    return answer;
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j]=sc.nextInt();
      }
    }
    int m = sc.nextInt();
    int[] mvs = new int[m];
    for (int i = 0; i < m; i++) {
      mvs[i] = sc.nextInt();
    }
    System.out.println(s.solution(arr, mvs));
  }
}

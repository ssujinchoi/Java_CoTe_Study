import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.09.
 */
//프로그래머스, 2019 카카오 크레인 인형뽑기
/*
의사코드
board 2차원 배열 열 값을 기준으로하는 ArrayList<Stack<Integer>>로 재구성
moves 값을 통해 각 열 값을 확인하여 각 열의 Stack의 값을 pop
stack에 넣으면서 pop 값과 push 값이 같으면 pop만 다르면 push만 실행
  */
class Solution{
  public int solution(int[][] board, int[] moves) {
    int answer = 0; //사라진 인형 수 카운트
    List<Stack<Integer>> lists = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();
    //2차원 배열 열을 기준으로 ArrayList
    for (int col = 0; col < board.length; col++) {
      Stack<Integer> clist = new Stack<>();
      for (int j = board.length-1; j>=0; j--) {
        int n = board[j][col];
        if(n>0) clist.push(n);
      }
      lists.add(clist);
    }
    //moves 배열을 통해 하나씩 뽑고 list 내 제거
    for (int i = 0; i < moves.length; i++) {
      int num = moves[i];
      //해당 열의 list에서 마지막 값 가져오고 지우기
      Stack<Integer> s = lists.get(num-1);
      int doll, compare;
      if(s.size()>0){
        doll = s.pop();
        if(stack.size()>0){
          compare = stack.pop();
          if(doll != compare){
            stack.push(compare);
            stack.push(doll);
          }else answer+=2;
        }else stack.push(doll);
      }
    }
    return answer;
  }
}
public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
    int[] moves = {1,5,3,5,1,2,1,4};
    System.out.println(s.solution(board, moves));
  }
}

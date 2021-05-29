import java.util.*;
// 수도코드
/* moves횟수만큼 반복문을 돌면서 열의 좌표는 moves로 잡고, 만약 moves가 1일 경우 1번열의 행에서 0이 아닌 값이 있을 때 까지 내려가야함으로 board를 행인 j값으로 설정
    moves는 1부터 시작하는데 인덱스로 접근해야함으로 moves-1를 해준다.
	board를 돌면서 0이면 무시한다.
    바구니는 스택자료구조를 사용한다. 격자(크레인)에서 뽑은 값을 스택에 값(인형)을 넣기 전에 스택에서 peek한 값과 격자에서 뽑은값이 같으면 넣지않고 pop만 한다. 
    이 과정이 터뜨려 지는 과정이므로 result를 2개씩 증가시켜주고 다음 지정된 열(moves의 위치)로 옮겨야함으로 break를 해준다.
    뽑은 값(인형)의 인덱스에는 0을 넣어준다.
*/
class Kakao19_CraneDollGame {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<moves.length; i++) {
            for(int j=0; j<board.length; j++) {
                int doll = board[j][moves[i]-1]; 

				if(doll == 0) continue;
				
				if(st.isEmpty()) {
					st.push(doll);
				} else {
					if(st.peek() != doll) {
						st.push(doll);
					} else {
						st.pop();
						answer+=2;	
					}
				}
				board[j][moves[i]-1] = 0;
				break;
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		Kakao19_CraneDollGame C = new Kakao19_CraneDollGame();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};

//		int[][] board = {{0,0,0,0,0},{0,2,1,0,0},{3,3,1,4,2},{5,5,4,3,1},{1,1,2,3,5}};
//		int[] moves = {1,2,5,4,2,3};
		System.out.println(C.solution(board, moves));
	}
}

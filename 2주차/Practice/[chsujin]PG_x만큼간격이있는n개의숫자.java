import java.util.*;
// 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
// x는 -10000000 이상, 10000000 이하인 정수입니다. n은 1000 이하인 자연수입니다.
/* 입출력예
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]
*/

// 1. x와n의 범위에 따라 int형은 범위에 벗어남으로 long형을 쓴다.
// 2. n의 개수만큼 출력해야함으로, n만큼 돌면서 x*i를 한다. x+x = x*2 / x+x+x = x*3와 같기 때문. 
class PG_XtoN {
     public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>();
			       
        for(long i=1; i<=n; i++) {
            answer.add(x*i);  
			
        }
        return answer;
    }
}

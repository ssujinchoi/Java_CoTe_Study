import java.util.*;
/* 의사코드
주식이 몇초동안 떨어지지 않았는지를 보는것임!
따라서, 주식의 가격을 스택에 담는 것이 아니라 주식가격의 인덱스를 스택에 담아서, prices[스택의인덱스]가격을 비교한다.
스택상단 인덱스의 값과 prices[i]의 가격을 비교해서 값이 떨어졌으면 그 인덱스의 차이만큼 answer의 해당인덱스에 담는다.
값이 같거나 증가할때는 스택에 계속 넣는다.
다 돌고나면 남은 스택은 전체길이에서 스택에 담긴 인덱스들의 차이를 구해서 주시가격이 떨어지지않은 기간을 answer에 넣는다.
*/
class Stock_Price {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; // 각 가격마다 떨어지지 않은 시간을 answer배열 담아 return
        Stack<Integer> stack = new Stack<Integer>(); // 인덱스 값을 넣을 스택생성
      
        for(int i=0; i<prices.length; i++) {
            while(!stack.empty()) { // 스택이 비어있지않을 때
                if(prices[stack.peek()] > prices[i]) { // 값이 떨어졌을 때
                    int preEl = stack.pop(); 
                    answer[preEl] = i-preEl; // 떨어진 시점의 인덱스 - 스택 상단값(이전 인덱스) 차이
                } else break;
            }
            stack.push(i); // 스택이 비었거나, 값이 같거나 증가할 때
        }
        
        while(!stack.empty()) { // 남은 스택 처리
            answer[stack.peek()] = (prices.length-1) - stack.pop(); // 전체길이에서 스택에 담긴 인덱스들의 차이
        }
        return answer;
    }
}
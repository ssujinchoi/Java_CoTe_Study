import java.util.*;
/*
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

입출력 예
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
*/
/*
1. divisor로 나눴을 때 몇개가 return될지 모르므로 arraylist사용
2. divisor의 배수를 구하면 됨으로 for문안에서 divisor로 나누어지는지만 확인하면된다.
3. answer의 기본값은 -1로 초기화시키고, divisor로 나눠지는 것이 없으면 list에 담긴 것이 없으므로 list.size()가 0이면 바로 return해준다.
*/
class PG_DivisorNumArr {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] answer = {-1};
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) {
			return answer;
		} else {
			answer = new int[list.size()];
			Collections.sort(list);
			for(int i=0; i<answer.length; i++) {
				answer[i] = list.get(i);
			}
    
		}
        return answer;
    }
}
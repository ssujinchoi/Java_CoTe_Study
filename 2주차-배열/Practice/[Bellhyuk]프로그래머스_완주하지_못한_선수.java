import java.lang.reflect.Array;
import java.util.*;
import javax.lang.model.type.ArrayType;

/**
 * @author Bellhyuk
 * @date '21.05.01.
 */
//프로그래머스_완주하지_못한_선수
/*
단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

의사코드
참여한 선수가 10만명 이하 -> O(n^2)을 쓰면 시간 초과
두 배열을 비교해서 같은 값이 존재하지 않는다면 해당 원소 return
리스트로 변경 후 해당 값이 있는지 확인

보다 높은 효율성을 위해서는 ArrayList가 아닌 HashMap들 사용해야 한다.
  */

class Solution {
  public String solution(String[] par, String[] com) {
    String answer = "";
    HashMap<String, Integer> map = new HashMap<>();
    //맵 만들기
    for(String c : com){
      if(map.containsKey(c)) map.put(c, map.get(c)+1);
      else map.put(c, 1);
    }
    //맵 중복 확인
    for(String p : par){
      if(map.containsKey(p) && map.get(p)>=1){
        map.put(p, map.get(p)-1);
      }
      else answer = p;
    }
    return answer;
  }
}

//시간초과
/*class Solution {
  public String solution(String[] par, String[] com) {
    String answer = "";
    ArrayList<String> list = new ArrayList(Arrays.asList(com));
    for(String p: par){
      if(list.contains(p)){
        list.remove(p);
      }else answer = p;
    }
    return answer;
  }
}*/

//참고풀이
/*class Solution {
  public String solution(String[] par, String[] com) {
    String answer = "";
    HashMap<String, Integer> map = new HashMap<>();
    //맵 만들기
    for(String p : par){
      if(map.containsKey(p)) map.put(p, map.get(p)+1);
      else map.put(p, 1);
    }
    //맵 중복 확인
    for(String c : com){
      map.put(c, map.get(c)-1);
    }
    for(String p:par){
      if(map.get(p)!=0){
        answer=p;
        break;
      }
    }
    return answer;
  }
}*/

public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    String[] participant = {"leo", "kiki", "eden"};
    String[] completion = {"eden", "kiki"};
    System.out.println(s.solution(participant, completion));
  }
}

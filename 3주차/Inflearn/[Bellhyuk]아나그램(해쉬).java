import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.03.
 */
//인프런 3week 2.아나그램(해쉬)
/*
의사코드
첫 줄은 map에 key와 value를 추가하고
두 번째 줄에서 map을 통해 비교하며 값이 같으면 YES, 하나라도 다르면 NO를 출력
  */

class Solution {
  public String solution(String i1, String i2) {
    String answer = "YES";
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();
    //첫 번째 줄 문장으로 map 형성
    for(char x1 : i1.toCharArray()){
      map1.put(x1,map1.getOrDefault(x1,0)+1);
    }

    //두 번재 줄 문장으로도 map 형성
    for(char x2 : i2.toCharArray()){
      map2.put(x2,map2.getOrDefault(x2,0)+1);
    }

    for(char x2 : i2.toCharArray()){
      if(map1.containsKey(x2) && map1.get(x2).equals(map2.get(x2))) continue;
      else answer = "NO";
    }
    return answer;
  }
}
public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    Scanner in = new Scanner(System.in);
    String input1 = in.nextLine();
    String input2 = in.nextLine();
    System.out.println(s.solution(input1, input2));
  }
}

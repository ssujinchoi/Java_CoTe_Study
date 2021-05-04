import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.03.
 */
//인프런 3week 1. 학급회장(해쉬)
/*
의사코드
후보 A,B,C,D,E를 키 값으로 하여 해당 값이 나올 때마다 value 값을 높여주고
가장 높은 value 값을 가진 key 값 출력
  */

class Solution {
  public char solution(int n, String i) {
    char answer=' ';
    Map<Character, Integer> map = new HashMap<>();
    for(char x : i.toCharArray()){
      map.put(x,map.getOrDefault(x,0)+1);
    }
    int max=-1;
    for(char key:map.keySet()){
      if(map.get(key)>max){
        max = map.get(key);
        answer = key;
      }
    }
    return answer;
  }
}
public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    String input = in.next();
    System.out.println(s.solution(num, input));
  }
}

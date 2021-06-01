import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.04.
 */
//인프런 3week 4.모든 아나그램 찾기
/*
의사코드
1. T문자열 HashMap 제작줌
2. T문자열 길이만큼 S문자열 map 제작
3. lt, rt를 통해 sliding window
4. sliding window를 하면서 T문자열 Haspmap 비교 및 count
  */
class Solution {
  //강사님 풀이
  public int solution2(String a,String b){
    int answer =0;
    Map<Character, Integer> am = new HashMap<>();
    Map<Character, Integer> bm = new HashMap<>();
    for(char c: b.toCharArray()) bm.put(c, bm.getOrDefault(c,0)+1);
    int L = b.length()-1;
    for (int i = 0; i < L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
    int lt = 0;
    for (int rt = L; rt < a.length(); rt++) {
      am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
      //java에서 map.equals를 해주면 key와 value 값이 같은지 모두 확인해준다.
      if(am.equals(bm)) answer++;
      am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
      if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
      lt++;
    }
    return answer;
  }

  //내 풀이
  public int solution(String s, String t){
    int answer=0;
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();
    //T문자열 기준으로 HashMap 제작
    for(char c:t.toCharArray()){
      map1.put(c, map1.getOrDefault(c, 0)+1);
    }
    //s문자열 map 제작
    char[] arr = s.toCharArray();
    for (int i = 0; i < t.length()-1; i++) {
      map2.put(arr[i], map2.getOrDefault(arr[i], 0)+1);
    }
    int lt=0, flag;
    for (int rt = t.length()-1; rt < s.length(); rt++) {
      flag=0;
      map2.put(arr[rt], map2.getOrDefault(arr[rt], 0)+1);
      for(char key:map1.keySet()){
        if(!map2.containsKey(key) || map2.get(key)!=map1.get(key)) break;
        flag++;
      }
      if(flag==map1.size()) answer++;
      map2.put(arr[lt], map2.get(arr[lt])-1);
      if(map2.get(arr[lt])==0) map2.remove(arr[lt]);
      lt++;
    }
    return answer;
  }
}
public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    Scanner in = new Scanner(System.in);
    String S = in.nextLine();
    String T = in.nextLine();
    System.out.println(s.solution2(S, T));
  }
}

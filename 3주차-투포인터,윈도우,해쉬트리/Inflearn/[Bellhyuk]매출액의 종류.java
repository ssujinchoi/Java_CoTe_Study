import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.04.
 */
//인프런 3week 3.매출액의 종류
/*
의사코드
기본 해쉬맵을 설정해준 다음에 rt와 lt를 따로 구분하여 진행하지
  */
class Solution {
  //강사 풀이
  public String solution2(int d, int s, String arr){
    StringBuilder sb = new StringBuilder();
    Map<String, Integer> map = new HashMap<>();
    String[] arrs = arr.split(" ");
    //첫 구간만큼 HahsMap 세팅하기
    for (int i = 0; i < s-1; i++) {
      map.put(arrs[i], map.getOrDefault(arrs[i], 0)+1);
    }
    int lt=0;
    for (int rt = s-1; rt < d; rt++) {
      map.put(arrs[rt], map.getOrDefault(arrs[rt], 0)+1);
      sb.append(map.size()).append(" ");
      map.put(arrs[lt], map.get(arrs[lt])-1);
      if(map.get(arrs[lt])==0) map.remove(arrs[lt]);
      lt++;
    }
    return sb.toString();
  }

  //내 풀이
  public String solution(int d, int s, String arr){
    StringBuilder sb = new StringBuilder();
    Map<String, Integer> map = new HashMap<>();
    String[] arrs = arr.split(" ");
    int left=0, right=0;
    map.put(arrs[left], 1);
    while(++right<d){
      if(right<s) map.put(arrs[right], map.getOrDefault(arrs[right], 0)+1);
      else{
        sb.append(map.size()).append(" ");
        map.put(arrs[right], map.getOrDefault(arrs[right], 0)+1);
        map.put(arrs[left], map.get(arrs[left])-1);
        if(map.get(arrs[left]).equals(0)) map.remove(arrs[left]);
        ++left;
      }
    }
    sb.append(map.size());
    return sb.toString();
  }
}
public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    Scanner in = new Scanner(System.in);
    int day = in.nextInt();
    int section = in.nextInt();
    in.nextLine();
    String arr = in.nextLine();
    System.out.println(s.solution2(day, section, arr));
  }
}

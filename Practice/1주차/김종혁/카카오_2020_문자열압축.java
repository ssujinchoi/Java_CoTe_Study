import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.04.29.
 */

//카카오_2020_인턴쉽_문자열 압축
/*
문자열에서 같은 값이 연속해서 나타나는 것을 그 문자의 개수와 반복되는 값으로 표현하여 더 짧은 문자열 줄여서 표현하는 알고리즘
압축할 문자열 s가 매개변수로 주어질 때, 위에 설명한 방법으로 1개 이상 단위로 문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이를 return 하도록 solution 함수를 완성
 */
class Solution {
  public int solution(String s){
    if(s.length() == 1) return 1;
    int answer=s.length();
    //자르는 크기 기준
    for (int i = 1; i < s.length(); i++) {
      int cnt =1;
      String now, next="";
      StringBuilder ans;
      ans = new StringBuilder();
      //자른 문자열 하나씩 확인
      for (int j = 0; j < s.length()/i; j++) {
        int start = i*j;
        int end  = i*(j+1);
        now = s.substring(start, end);
        if(end+i > s.length()-1) next=s.substring(end);
        else next = s.substring(end, end+i);
        if(now.equals(next)) cnt++;
        else{
          if(cnt>1) ans.append(cnt).append(now);
          else ans.append(now);
          cnt = 1;
        }
        if(end > s.length()-1) ans.append(next);
      }
      if(s.length()/i !=0) ans.append(next);
      if(ans.length() < answer) answer = ans.length();
    }
    return answer;
  }
}

public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(s.solution(str));
  }
}

/**
 * 다른 사람 풀이
 * 프로그래머스 - 송동훈, choiyeoonseok
 * 자른 문자열을 비교할 때 stratsWith를 썼다는 사실이 신기하네..
 * 개인적으로 재귀함수를 잘 못써서 음.. 어떻게 해야할까나
 */

class Solution1 {
  public int solution(String s) {
    int answer = 0;

    for(int i=1; i<=(s.length()/2)+1; i++){
      int result = getSplitedLength(s, i, 1).length();
      answer = i==1 ? result : (Math.min(answer, result));
    }

    return answer;
  }

  public String getSplitedLength(String s, int n, int repeat){
    if(s.length() < n) return s;
    String result = "";
    String preString = s.substring(0, n);
    String postString = s.substring(n, s.length());

    // 불일치 -> 현재까지 [반복횟수 + 반복문자] 조합
    if(!postString.startsWith(preString)){
      if(repeat ==1) return result += preString + getSplitedLength(postString, n, 1);
      return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
    }

    return result += getSplitedLength(postString, n, repeat+1);
  }
}

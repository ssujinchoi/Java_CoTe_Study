import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.04.30.
 */
//카카오_2019_불량 사용자
/*
이벤트에 응모한 전체 사용자 아이디 목록
불량 사용자 아이디 목록(아이디 중 일부 문자를 * 문자로 가려서 전달, 최소 하나 이상 사용)
불량 사용자 목록에 매핑된 응모자 아이디 -> 제재 아이디
제재 아이디 목록은 몇가지 경우의 수?
 */

//혼자서 못풀었습니다. 다시 풀이 필요
/**
 * 출처: https://bcp0109.tistory.com/186
 * 사용자 목록에서 DFS 로 banned_id.length 만큼의 사용자를 뽑습니다.(최대 길이가 8으로 괜찮음)
 * 뽑힌 사용자들을 banned_id 와 비교하여 일치하는 케이스를 구하면 됩니다.
 * 중복된 값은 모두 하나의 경우가 되기 때문에 set 에 넣어서 필터링 해줍니다.
 *
 * boolean isSameString(String a, String b) 함수는 두 String 의 일치 여부를 판단합니다.
 * boolean isBannedUsers(Set<String> set, String[] banned_id) 함수는 뽑힌 set 과 banned_id 목록을 비교하여 경우의 수에 해당되는지 판단
 * 어차피 중복은 제거되기 때문에 banned_id 와 일대일 비교를 하기 위해 set 을 LinkedHashSet 으로 선언
 *
  */
class Solution {
  private Set<Set<String>> result;

  public int solution(String[] user_id, String[] banned_id) {
    result = new HashSet<>();
    dfs(user_id, banned_id, new LinkedHashSet<>());
    return result.size();
  }
  
  //Combination 알고리즘
  private void dfs(String[] user_id, String[] banned_id, Set<String> set){
    if(set.size() == banned_id.length){
      if(isBannedUsers(set, banned_id)){
        result.add(new HashSet<String>(set));
      }
      return;
    }
    for(String userId: user_id){
      if(!set.contains(userId)){
        set.add(userId);
        dfs(user_id, banned_id, set);
        set.remove(userId);
      }
    }
  }

  private boolean isBannedUsers(Set<String> set, String[] banned_id){
    int i=0;
    for(String user: set){
      if(!isSameString(user, banned_id[i++])) return false;
    }
    return true;
  }
  private boolean isSameString(String a, String b){
    if(a.length() != b.length()){
      return false;
    }
    for(int i=0; i<a.length(); i++){
      if(b.charAt(i)=='*') continue;
      if(a.charAt(i) != b.charAt(i)) return false;
    }
    return true;
  }
}

public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
    String[] banned_id = {"fr*d*", "abc1**"};
    System.out.println(s.solution(user_id, banned_id));
  }
}

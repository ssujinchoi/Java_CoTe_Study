package Section1_String;

/*10.가장 짧은 문자거리
저작권상 공개가 어렵습니다.
*/
import java.util.*;

//어려움...
public class no_10 {
  //tg와 떨어진 가장 짧은 거리, 모든 tg 탐색
  public String solution(String str, String tg) {
    String ans="";
    int[] answer = new int[str.length()];
    int dis=10000;//큰 수로 초기화
    int len=str.length();
    for(int i=0;i<len;i++) {//e를 기준으로 거리 계산
      if(str.charAt(i)==tg.charAt(0)) dis=0;
      else dis++;
      answer[i]=dis;
    }
    dis=10000;//큰 수로 초기화
    for(int i=len-1;i>=0;i--) {//거꾸로 확인해서 값이 작으면 바꾸기
      if(str.charAt(i)==tg.charAt(0)) dis=0;
      else dis++;
      //if(answer[i]>dis) answer[i]=dis;
      answer[i]=Math.min(answer[i], dis);
    }
    for(int a:answer) {
      ans += a+" ";
    }
    return ans;
  }
  
  public static void main(String[] args) {
    no_10 T = new no_10();
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    System.out.println(T.solution(s, t));
  }
}

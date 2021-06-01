package Section1_String;

/*10.문자열 압축
저작권 관련 문제 제거
*/
import java.util.*;

public class no_11 {
  //풀이
  //한꺼번에 돌리는 것이 나중에 차례대로 보기에도 편하다.
  public String solution(String str) {
    String answer ="";
    String s=str+" ";//다음 것과 비교하기위해 빈 문자 붙이기
    int cnt=1;
    for(int i=0; i<s.length()-1; i++) {
      if(s.charAt(i)==s.charAt(i+1)) cnt++;
      else {
        answer+=s.charAt(i);
        if(cnt>1) answer+=cnt;
        cnt=1;
      }
    }
    return answer;
  }
  //내 풀이
  /*public String solution(String str) {
    String answer="";
    char ch=str.charAt(0);
    int cnt=1, len=str.length();
    char[] arr = str.toCharArray();
    answer += ch;
    for(int i=1;i<len;i++) {
      if(ch!=arr[i]) {
        if(cnt>1) answer += cnt;
        answer += arr[i];
        ch=arr[i];
        cnt=1;
      }
      else {
        cnt++;
      }
    }
    if(cnt>1) answer+=cnt;
    return answer;
  }*/
  
  public static void main(String[] args) {
    no_11 T = new no_11();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(T.solution(str));
  }
}

package Section1_String;

/*12. 암호
저작권 관련 문제 제거

의사코드
1.replace 함수를 통해 #을 1로 *을 0으로 변환
2.7자리씩 문자열을 자름
3.이진수 -> 십진수
4.char를 통해 아스키 번호 -> 문자
5.문자 합치기
*/
import java.util.*;

public class no_12 {
  //풀이
  public String solution(int n, String str) {
    String answer ="";
    for(int i=0;i<n;i++) {
      String tmp=str.substring(0,7).replace('#','1').replace('*', '0');//앞에서부터 7개 뽑아온 것만 다루기
      int num = Integer.parseInt(tmp, 2);
      answer += (char)num;
      str = str.substring(7);//이렇게 저장해 놓으면 하나씩 뽑아쓸 수 있다.
    }
    return answer;
  }
  
  //내 풀이
  /*public String solution(int n, String str) {
    String answer="";
    int len = str.length();
    //replace를 통해 변환
    str = str.replace('#', '1');
    str = str.replace('*', '0');
    //7자리씩 문자열 자름
    String[] ans = new String[len/7];
    for(int i=0;i<len/7;i++) {
      ans[i]=str.substring(0+i*7, 7+i*7);
    }
    for(String s:ans) {
      int num = Integer.parseInt(s, 2);
      answer += (char)num;
    }
    return answer;
  }*/
  
  public static void main(String[] args) {
    no_12 T = new no_12();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    System.out.println(T.solution(n, str));
  }
}

package Section1_String;

/*6. 중복문자 제거
저작권 관련 문제 제거
*/
import java.util.*;

public class no_6 {
  //indexOf 사용, index 번호와 indexOf 값이 같으면 처음 발견된 것으로 볼 수 있다.
  public String solution(String str) {
    String answer="";
    for(int i=0;i<str.length();i++) {
      if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
    }
    return answer;
  }
  
  public static void main(String[] args) {
    no_6 T = new no_6();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(T.solution(str));
  }
  
  //LinkedHashSet 사용
  /*public void solution(String str){
      char[] s = str.toCharArray();
      Set<Character> ss = new LinkedHashSet<>();
      for(char c:s) {
        ss.add(c);
      }
      Iterator<Character> iter = ss.iterator();
      while(iter.hasNext()) {
        System.out.print(iter.next());
      }
  }
  
  public static void main(String[] args) {
    Main T = new Main();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    T.solution(str);
  }*/
}

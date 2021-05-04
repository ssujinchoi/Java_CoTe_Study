package Section1_String;

/*5. 특정 문자 뒤집기
저작권 관련 문제 제거
*/
import java.util.*;

public class no_5 { 
/*  public String solution(String str){
    char[] s = str.toCharArray();
    int lt=0, rt=s.length-1;
    //A=65, Z=90, a=97, z=122
    while(lt<rt) {
      if((65>s[lt] && s[lt]>90) || (97>s[lt] && s[lt]>122)) lt++;
      else if((65>s[lt] && s[lt]>90) || (97>s[lt] && s[lt]>122)) rt--;
      else {
        char tmp=s[lt];
        s[lt]=s[rt];
        s[rt]=tmp;
        lt++;
        rt--; 
      }
    }
    return String.valueOf(s);
  }*/
  
  public String solution(String str){
    char[] s = str.toCharArray();
    int lt=0, rt=s.length-1;
    while(lt<rt) {
      if(!Character.isAlphabetic(s[lt])) lt++; //isAlphabetic method라.. ㅋㅋㅋ 처음 보네
      else if(!Character.isAlphabetic(s[rt])) rt--;
      else {
        char tmp=s[lt];
        s[lt]=s[rt];
        s[rt]=tmp;
        lt++;
        rt--; 
      }
    }
    return String.valueOf(s);
  }
  
  public static void main(String[] args) {
    no_5 T = new no_5();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(T.solution(str));
  }
}

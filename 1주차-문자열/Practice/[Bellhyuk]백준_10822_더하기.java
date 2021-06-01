package practice;

import java.io.*;
/*
<Problem> - 더하기 10822번
숫자와 콤마로만 이루어진 문자열 S가 주어진다.
이때, S에 포함되어있는 자연수의 합을 구하는 프로그램을 작성하시오.
S의 첫 문자와 마지막 문자는 항상 숫자이고, 콤마는 연속해서 주어지지 않는다.
주어지는 수는 항상 자연수이다.

입력
첫째 줄에 문자열 S가 주어진다. S의 길이는 최대 100이다.
포함되어있는 정수는 1,000,000보다 작거나 같은 자연수이다.

출력
문자열 S에 포함되어 있는 자연수의 합을 출력한다.
*/
/**
 * My code
 * @author Bellhyuk
 * @date '21.04.25.
 * 
 * <의사코드>
 * 그냥 ,으로 split해서 for문 하나 돌려 O(N)을 만들어주자.
 * 
 */

class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(",");
    int answer=0;
    for(String a: str) {
      answer += Integer.parseInt(a);
    }
    System.out.println(answer);
  }
}
/**
 * Best Coding(코드도 적당히 짧고 메모리와 시간이 작은 것을 중심으로)
 * @author  dlwodnsdl
 * 
 */
/*public class Main {
  public static void main(String[] args) throws Exception {
 }
}*/

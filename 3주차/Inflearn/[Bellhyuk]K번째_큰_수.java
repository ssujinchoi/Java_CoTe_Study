import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.11.
 */
//인프런 Section 4-5 K번째 큰 수
/*
의사코드
N개의 수에서 3장을 뽑아 나오는 합 중에서 K번째로 큰 수를 구하자
일단 two pointer 알고리즘으로 3장으로 나올 수 있는 합을 set으로 추출
set -> list 후 정렬 및 k 번째 위치한 값 출력
  */
//강사 풀이
class Solution1{
  public int solution(int n, int k, int[] arr) {
    int answer = -1;
    Set<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder());//TreeSet을 통해 자동 정렬
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int l = j + 1; l < n; l++) {
          Tset.add(arr[i] + arr[j] + arr[l]);
        }
      }
    }
    int cnt=0;
    for(int x : Tset){
      cnt++;
      if(cnt==k) return x;
    }
    return answer;
  }
}

//내 풀이
class Solution{
  public int solution(int n, int k, int[] arr) {
    int answer = -1;
    int lt = 0, mt = 1, rt = 1;
    Set<Integer> set = new TreeSet<Integer>();
    while(rt++>0){
      if (rt > n - 1) {
        mt++;
        rt = mt + 1;
      }
      if (mt > n - 2) {
        lt++;
        mt = lt + 1;
        rt = mt + 1;
      }
      if(lt>n-3) break;
      set.add(arr[lt] + arr[mt] + arr[rt]);
    }
    //set -> list로 전환하는 ArrayList 메소드의 시간복잡도가 생각보다 크다.. 이것 때문에 Runtime 에러 뜸
    int cnt=0;
    for (int x: set){
      cnt++;
      if(cnt==set.size()-k+1) return x;
    }
    return answer;
  }
}

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println(s.solution(n, k, arr));
  }
}

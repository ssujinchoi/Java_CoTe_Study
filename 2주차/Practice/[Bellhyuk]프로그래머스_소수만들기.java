import java.util.*;
/**
 * @author Bellhyuk
 * @date '21.05.01.
 */
//프로그래머스_소수만들기
/*
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return
  */
class Solution {
  public int solution(int[] nums) {
    int cnt=0; //소수 갯수
    //소수 체크 배열 생성
    int[] arr = new int[50000];//조건 1000이하의 자연수, 최대 50개
    for (int i = 2; i*i <= arr.length; i++) {
      if(arr[i]==1) continue;
      for (int j = 2*i; j<=arr.length-1; j+=i) {
        arr[j]=1; //check
      }
    }
    //Two Pointer 알고리즘
    int one=0, two=1, thr=2;
    int check = 0;
    while(one <= nums.length-3){
      check++;
      int sum = nums[one]+nums[two]+nums[thr];
      if(arr[sum]==0) cnt++;
      if(two==nums.length-2){
        one++;
        two = one+1;
        thr = one+2;
        continue;
      }
      if(thr== nums.length-1){
        two++;
        thr = two+1;
        continue;
      }
      thr++;
    }
    return cnt;
  }
}

public class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    int[] nums = {1,2,3,4,5,6};
    System.out.println(s.solution(nums));
  }
}

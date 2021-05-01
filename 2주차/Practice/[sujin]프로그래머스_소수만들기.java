// import java.util.*;
// 원래는 3중 for문 대신 조합알고리즘을 사용하려했으나 아직 이해가 안되서 못씀.. 
// 소수판단isPrime을 에라토스테네스 체로 변경해보기
class CreateMinority_2 {
	public boolean isPrime(int number) {
        boolean check = true;
        if(number==1) return false;
        for(int i=2; i<number; i++) {
            if(number%i == 0) check = false;
        }
        return check;
    }
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        int count = 0;
        
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) {
                        answer++; 
                    }
                }
            }
        }

        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		CreateMinority_2 C = new CreateMinority_2();
		System.out.println(C.solution(arr));
	}
}

//import java.util.*;

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
                        answer++;  answer = count++; 
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

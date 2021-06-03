import java.util.*;
  
public class IFR2_1 {
  public ArrayList<Integer> solution(int[] arr) {
  	ArrayList<Integer> answer = new ArrayList<>();
    answer.add(arr[0]);
    for(int i=0; i<arr.length-1; i++) { 
      if(arr[i] < arr[i+1]) {
        answer.add(arr[i+1]);
      }
    }
    return answer;
  }
  
  public static void main(String[] args){
    IFR2_1 C = new IFR2_1();
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
   	for(int i=0; i<n; i++) {
     	arr[i] = sc.nextInt(); 
    }
    for(int x : C.solution(arr)){
    	System.out.print(x + " ");
    }
  }
}
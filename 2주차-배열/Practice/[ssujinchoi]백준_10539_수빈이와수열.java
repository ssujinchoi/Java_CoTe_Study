import java.util.*;

class BJ10539{
	public static void main(String[] args) {
		BJ10539 C = new BJ10539();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] B = new int[n];
		int[] A = new int[n];
		int[] tmp = new int[n];

		for(int i=0; i<n; i++) {
			B[i] = sc.nextInt();
		}

		for(int i=0; i<B.length; i++) {
			tmp[i] = B[i] * (i+1); 
		}

		A[0] = tmp[0];
		for(int i=1; i<A.length; i++) {
			A[i] = tmp[i] - tmp[i-1];
		}

		for(int x : A) System.out.print(x + " ");
	}
}

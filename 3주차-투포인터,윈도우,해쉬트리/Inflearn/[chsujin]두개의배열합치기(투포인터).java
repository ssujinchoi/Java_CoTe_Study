import java.util.*;
// 의사코드
class IFR3_1 {
	public ArrayList<Integer> solution(int n, int m, int[] nArr, int[] mArr) {
		ArrayList<Integer> list = new ArrayList<>();
		int p1 = 0, p2 = 0;

		while (p1<n && p2<m) {
			if(nArr[p1] < mArr[p2]) {
				list.add(nArr[p1++]);
			} else {
				list.add(mArr[p2++]);
			}
		}
		while(p1<n) {
			list.add(nArr[p1++]);
		}
		while(p2<m) {
			list.add(mArr[p2++]);
		}

		return list;
	}
	public static void main(String[] args) {
		IFR3_1 C = new IFR3_1();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] nArr = new int[n];
		for(int i=0; i<n; i++) {
			nArr[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] mArr = new int[m];
		for(int i=0; i<m; i++) {
			mArr[i] = sc.nextInt();
		}

		for(int x : C.solution(n, m, nArr, mArr)) {
			System.out.print(x + " ");
		}
	}
}

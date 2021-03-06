import java.util.*;
// 행렬의 합구하기, 행과 열의 크기가 같다.
class MatrixSum {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		MatrixSum C = new MatrixSum();
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		C.solution(arr1, arr2);
	}
}
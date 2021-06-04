import java.util.*;
// N장의 카드, 차례로 1부터 N까지의 번호가 붙어 있으며, 1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있다.
// 카드가 한 장 남을 때까지 반복. 우선, 제일 위에 있는 카드를 바닥에 버린다. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
// 예를 들어 N=4인 경우, 1을 버리면 234가 남는다. 여기서 2를 제일 아래로 옮기면 342가 된다. 
// 3을 버리면 42가 되고, 4를 밑으로 옮기면 24가 된다. 마지막으로 2를 버리고 나면, 남는 카드는 4가 된다.
//N이 주어졌을 때, 제일 마지막에 남게 되는 카드를 구하는 프로그램을 작성하시오.
/*
그냥 큐 자료구조를 사용해서 문제의 설명대로 구현하면된다.
*/
class BJ2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Queue<Integer> que = new LinkedList<>();
		for(int i=1; i<=n; i++) que.offer(i);

		while(n-- > 1) {
			que.poll();
			que.offer(que.poll());
		}
		System.out.print(que.peek());
	}
}

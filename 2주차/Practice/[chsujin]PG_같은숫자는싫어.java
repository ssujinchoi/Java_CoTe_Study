class PG_NotSameNumber {
	public int[] solution(int []arr) {
        int len = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
		//1. queue사용
//         Queue<Integer> queue = new LinkedList<Integer>();
//         int preElement = arr[0];
//         queue.add(preElement);
        
//         for(int i=1; i<len; i++) {
//             if(preElement != arr[i]) {
//                 queue.add(arr[i]);
//                 preElement = arr[i];
//             }
//         }
//         int[] answer = new int[queue.size()];
        
//         for(int i=0; i<answer.length; i++) answer[i] = queue.poll();
        
		//2. arraylist사용
       for(int i=0; i<len-1; i++) {
           if(arr[i] != arr[i+1]) {
               list.add(arr[i]);
           }
       }
       list.add(arr[len-1]);
       int[] answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

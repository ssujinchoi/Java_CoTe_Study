import java.util.*;

class Bridge_Truck {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int weightsum = 0;
        
        Queue<Integer> q = new LinkedList<>(); // 큐 = 다리
        
        for(int i=0; i<truck_weights.length; i++) { // 대기트럭수만큼 반복
        	while(true) {
        		if(q.isEmpty()) { // 1. 큐(다리)가 비어있으면 
        			q.add(truck_weights[i]); // 무조건 트럭을 넣는다.
             	   	weightsum += truck_weights[i]; // 트럭무게합에 처음넣은 트럭무게를 넣어줌.
             	   	time++; 
             	   	break;
                } else if(q.size() == bridge_length){ // 3. 큐(다리)가 꽉찼을 때
					weightsum -= q.poll(); // 트럭무게합에서 다리를 지난트럭의 무게를 빼줌.
                } else { // 2. 큐(다리)가 덜찬 경우
                	if(weightsum + truck_weights[i] > weight) { // 2-1. 현재무게합 + 다음트럭무게 > 견디는무게
                		q.add(0); // (0kg) 무게가없는 트럭을 넣어줌
                		time++; 
                	} else { // 2-2. 현재무게합 + 다음트럭무게 <= 견디는무게
            			q.add(truck_weights[i]); // 다음트럭을 큐(다리)에 넣어줌.
                 	   	weightsum += truck_weights[i]; // 현재무게에 합해줌
                 	   	time++; 
                 	   	break;
                	}
                }
        	}
        }
        return time + bridge_length; // 마지막에 남은 트럭은 다리의길이만큼 나오는데 시간이 걸린다
    }
	public static void main(String[] args) {
		Bridge_Truck C = new Bridge_Truck();
		int bridge_length = 2;
		int weight = 10	;
		int[] truck_weights = {7,4,5,6};
		System.out.println(C.solution(bridge_length, weight, truck_weights));
	}
}

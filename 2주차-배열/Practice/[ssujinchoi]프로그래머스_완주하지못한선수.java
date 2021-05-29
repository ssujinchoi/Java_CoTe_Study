import java.util.*;
// 프로그래머스 - 완주하지 못한 선수
/*통과 (134.62ms, 81.6MB)
통과 (321.06ms, 88.3MB)
통과 (279.26ms, 94.1MB)
통과 (328.94ms, 96MB)
통과 (299.36ms, 95.6MB)*/
class UnfinishedRunner_1 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i;
        for(i=0; i<completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return answer = participant[i];
            }
        }
        return answer = participant[i];
    }

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

public static String solution(String[] participant, String[] completion) { 
	HashMap map = new HashMap<>(); 
	for (int i = 0; i < participant.length ; i++) { 
		map.compute(participant[i], (k, v) -> v != null ? null : 1); 
		if (i < completion.length) map.compute(completion[i], (k,v) -> v != null ? null : 1); 
	} 
	return map.keySet().iterator().next(); 
}
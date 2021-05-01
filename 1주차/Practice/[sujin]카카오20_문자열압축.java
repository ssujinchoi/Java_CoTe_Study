import java.util.*;

class Kakao_20St {
	public int solution(String s) {
		int answer = s.length();
        int cnt = 1; 
        String tmp = "";
		
		for(int i=1; i<=s.length()/2; i++) {
            String first = s.substring(0, i);

			for(int j=i; j<s.length(); j+=i) {
				String second = "";
                if(j+i >= s.length()) second = s.substring(j, s.length());
                else second = s.substring(j, j+i);
                if(first.equals(second)) {
                    cnt++;
                } else {
                    if(cnt == 1) {
                        tmp += first;                  
                    } else {
                        tmp += Integer.toString(cnt) + first;
                    }
                    first = second;
                    cnt = 1;
                }
            }
            if(answer > tmp.length()) {
                answer = tmp.length();
            }
		}
		return answer;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		Kakao_20St C = new Kakao_20St();
		System.out.println(C.solution(str));
	}
}

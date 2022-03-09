package programmers.lv1;

public class N12921 {
	public static void main(String[] args) {
		int n = 10;
		solution(n);
	}
    public static int solution(int n) {
        int answer = 0;
        
        for (int j = 2; j <= n; j++) {
        	boolean b = true;
        	for (int i = 2; i <= Math.sqrt(j); i++) {
        		if(j%i == 0) {
        			b = false;
        			break;
        		}
        	}
        	if(b) {
        		answer++;
        	}		
		}
        
        return answer;
    }
}

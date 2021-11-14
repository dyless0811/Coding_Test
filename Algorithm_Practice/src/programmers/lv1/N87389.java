package programmers.lv1;

public class N87389 {
	public static void main(String[] args) {
//		int n = 10;
		int n = 12;
		solution(n);
	}
	
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n / 2; i++) {
        	if((n-1) % i == 0) {
        		answer = i;
        		break;
        	}
		}
        answer = answer == 0 ? n-1 : answer;
        return answer;
    }
}

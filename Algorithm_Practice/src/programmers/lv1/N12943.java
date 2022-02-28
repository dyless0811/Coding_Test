package programmers.lv1;

public class N12943 {
	public static void main(String[] args) {
		long num = 626331;
		solution(num);
	}
	
    public static int solution(long num) {
        int answer = 0;
        
        while(answer <= 500) {
        	if(num == 1) {
        		break;
        	}
        	answer++;
        	if(num%2 == 0) {
        		num = num/2;
        	} else {
        		num = num * 3 + 1;
        	}
        }
        
        return num == 1 ? answer : -1;
    }
}

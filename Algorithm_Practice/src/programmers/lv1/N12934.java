package programmers.lv1;

public class N12934 {
	public static void main(String[] args) {
		long n = 121;
		solution(n);
	}
    public static long solution(long n) {
    	long answer = -1;
        double pow = Math.pow(n,0.5);
        if(pow == (int) pow){
        	answer = (long) Math.pow(pow+1, 2);
        }
        return answer;
    }
}

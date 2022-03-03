package programmers.lv1;

public class N12931 {
	public static void main(String[] args) {
		int n = 987;
		solution(n);
	}
	
    public static int solution(int n) {
        int answer = 0;
        while(n != 0) {
        	answer += n%10;
        	n /= 10;
        }
        System.out.println(answer);
        return answer;
    }
}

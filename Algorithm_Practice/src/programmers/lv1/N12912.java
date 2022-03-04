package programmers.lv1;

public class N12912 {
	public static void main(String[] args) {
//		int a = 3, b = 5;
		int a = 5, b = 3;
		solution(a, b);
	}
    public static long solution(long a, long b) {
        long answer = 0;
        long t = 0;
        if(a>b) {
        	t = a;
        	a = b;
        	b = t;
        }
        answer = (b - a + 1) * (a + b) / 2;
        System.out.println(answer);
        return answer;
    }
}

package programmers.lv1;

public class N77884 {
	public static void main(String[] args) {
		int left = 13, right = 17;
		solution(left, right);
	}
    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
        	double sqrt = Math.sqrt(i);
        	
        	answer += i%sqrt==0 ? -i : i;
		}
        return answer;
    }
}

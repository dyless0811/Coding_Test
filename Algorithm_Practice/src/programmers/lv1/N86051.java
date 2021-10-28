package programmers.lv1;

public class N86051 {
	public static void main(String[] args) {
		int[] list = {1,2,3,4,6,7,8,0};
		solution(list);
	}
	
	public static int solution(int[] numbers) {
        int answer = -1;
        
        answer = 1+2+3+4+5+6+7+8+9;
        
        for (int i : numbers) {
			answer -= i;
		}
        
        return answer;
    }
}
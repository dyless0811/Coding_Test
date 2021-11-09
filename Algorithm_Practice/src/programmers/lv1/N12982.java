package programmers.lv1;

import java.util.Arrays;

public class N12982 {
	public static void main(String[] args) {
//		int[] d = {1,3,2,5,4};
		int[] d = {2,2,3,3};
//		int budget = 9;
		int budget = 10;
		solution(d, budget);
	}
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        while(budget >= d[answer]) {
        	budget -= d[answer];
        	answer++;
        	if(answer==d.length) return answer;
        }
        
        return answer;
    }
}

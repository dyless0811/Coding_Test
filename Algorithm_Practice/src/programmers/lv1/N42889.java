package programmers.lv1;

import java.util.HashMap;

public class N42889 {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		solution(N, stages);
	}
	
    public static int[] solution(int N, int[] stages) {
        int[] reached = new int[N+1];
        int[] stucked = new int[N+1];
        float[] rate = new float[N];
        int[] answer = new int[N];
        
        for (int stage : stages) {
        	stucked[stage-1]++;
        	for (int j = 0; j < stage; j++) {
				reached[j]++;
			}
		}
        
        for (int i = 0; i < N; i++) {
		 	rate[i] = (float)stucked[i] / reached[i];
		 	answer[i] = i+1;
		}
        
        for (int i = 0; i < N; i++) {
			float temp = -1;
        	for (int j = 0; j < N; j++) {
				if(rate[j] > temp) {
					temp = rate[j];
					answer[i] = j+1;
				}
			}
        	rate[answer[i]-1] = -1;
		}
        
        for (int i : answer) {
			System.out.println(i);
		}
        
        return answer;
    }
}

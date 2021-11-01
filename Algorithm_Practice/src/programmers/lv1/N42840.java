package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class N42840 {
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
//		int[] answers = {1,3,2,4,2};
		solution(answers);
	}
	
    public static int[] solution(int[] answers) {
        int[][] supoja = {{1,2,3,4,5},
        				{2,1,2,3,2,4,2,5},
        				{3,3,1,1,2,2,4,4,5,5}};
        int[] count = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
        	for (int j = 0; j < count.length; j++) {
				if(answers[i] == supoja[j][i%supoja[j].length]) count[j]++;
			}
        }
    	
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < count.length; i++) {
			if(count[i] == max) {
				list.add(i+1);
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}

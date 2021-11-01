package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class N42862 {
	public static void main(String[] args) {
		
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		solution(n, lost, reserve);
	}
	
    public static int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Integer> students = new HashMap<>();
        
        for (int i = 1; i < n+1; i++) {
			students.put(i, 1);
		}
        
        for (int i : lost) {
			students.put(i, students.get(i)-1);
		}
        
        for (int i : reserve) {
			students.put(i, students.get(i)+1);
		} 
        
        int answer = n;
        for (int i : students.keySet()) {
			if(students.get(i) == 0) answer--;
		}
        
        for (int i = 1; i < n; i++) {
			int share = students.get(i)-students.get(i+1);
			if(share == -2 || share == 2) {
				answer++;
				i++;
			}
		}
        
        System.out.println(answer);
        return answer;
    }
}

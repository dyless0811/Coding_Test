package programmers.lv1;

import java.util.TreeSet;

public class N68644 {
	
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		solution(numbers);
	}
	
    public static int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
        int[] answer = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
        	answer[i++] = integer;
		}
        return answer;
    }
	
}


package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class N12910 {
	public static void main(String[] args) {
//		int[] arr = {5,9,7,10};
//		int divisor = 5;
		int[] arr = {2,36,1,3};
		int divisor = 1;
		solution(arr, divisor);
	}
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
    	List<Integer> a = new ArrayList<>();
        for (int i : arr) {
			if(i%divisor==0) {
				a.add(i);
			}
		}
        if(a.size() == 0) {
        	return answer;
        }
        a.sort(null);
        answer = a.stream().mapToInt(Integer::intValue).toArray();   
        return answer;
    }
}

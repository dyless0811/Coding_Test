package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class N12935 {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		solution(arr);
	}
    public static int[] solution(int[] arr) {

        int tmp = arr[0];
    	for (int i = 1; i < arr.length; i++) {
			if(tmp > arr[i]) {
				tmp = arr[i];
			}
		}
    	List<Integer> nList = new ArrayList<>();
        
    	for (int i : arr) {
			if(i != tmp) {
				nList.add(i);
			}
		}
    	
    	return nList.size() == 0 ? new int[] {-1}
    							: nList.stream().mapToInt(i -> i).toArray();
    }
}

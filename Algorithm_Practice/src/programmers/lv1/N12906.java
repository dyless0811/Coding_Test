package programmers.lv1;

import java.util.ArrayList;

public class N12906 {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		solution(arr);
	}
	
    public static ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int tmp = 10000000;
        
        for (int n : arr) {
        	if(n == tmp)
        		continue;
        	tmp = n;
        	list.add(n);
		}        
        
        return list;
    }
}

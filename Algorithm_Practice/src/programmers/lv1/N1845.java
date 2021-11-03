package programmers.lv1;

import java.util.HashSet;

public class N1845 {
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		solution(nums);
	}
	
    public static int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for (Integer i : nums) {
			set.add(i);
		}
        
        answer = nums.length/2 > set.size() ? set.size() : nums.length/2;
        
        return answer;
    }
}

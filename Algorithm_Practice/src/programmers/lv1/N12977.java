package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class N12977 {
	public static void main(String[] args) {
//		int[] nums = {1,2,3,4};
		int[] nums = {1,2,7,6,4};
		solution(nums);
	}
	
    public static int solution(int[] nums) {
        int answer = 0;
        int totalTriNum = 0;
        
        for (int i = 3; i <= nums.length; i++) {
        	int topLength = i - 2;
        	int triNum = (topLength+1) * (topLength*10/2) / 10;
        	System.out.println(triNum);
        	totalTriNum += triNum;
		}
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
			list.add(i);
		}
        
        HashSet<HashSet> set = new HashSet<>();
        
        while(set.size() < totalTriNum) {
        	ArrayList<Integer> tempList = (ArrayList<Integer>)list.clone();
        	Collections.shuffle(tempList);
        	HashSet<Integer> temp = new HashSet<>();
        	for (int i = 0; i < 3; i++) {
				temp.add(tempList.get(0));
				tempList.remove(0);
			}
        	set.add(temp);
        }
        
        for (HashSet<Integer> hashSet : set) {
        	System.out.print("{");
			for (Integer i : hashSet) {
				System.out.print(i);
			}
			System.out.println("}");
		}
        
        for (HashSet<Integer> is : set) {
        	int target = 0;
			for (int i : is) {
				target += i;
			}
			boolean isPrimeNum = true;
			for(int i = 2; i < target/2; i++) {
				System.out.println(target+" % "+i+" = "+target/2);
				if(target % i == 0) {
					isPrimeNum = false;
					break;
				}
			}
			System.out.println(target+" = "+isPrimeNum);
			if(isPrimeNum) answer++;
		}
        
        System.out.println(answer);
        
        return answer;
    }
    
    /*    
     *      for(int i = 0; i < nums.length - 2; i ++){
     *           for(int j = i + 1; j < nums.length - 1; j ++){
     *               for(int k = j + 1; k < nums.length; k ++ ){
     *               }
     *           }   
     *      }   
     *      이걸 못해서..
     */   
}
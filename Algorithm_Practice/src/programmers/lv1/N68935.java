package programmers.lv1;

import java.util.ArrayList;

public class N68935 {
	public static void main(String[] args) {
		solution(45);
	}
    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> ternary = new ArrayList<>();
        do {
        	ternary.add(n%3);
        	n /= 3;
        } while(n!=0);
        
        int size = ternary.size()-1;
        
        for (int i = 0, squd = size; i <= size; i++, squd--) {
        	int value = (int) (ternary.get(i) * Math.pow(3, squd));
			answer += value;
		}
        
        return answer;
    }
}

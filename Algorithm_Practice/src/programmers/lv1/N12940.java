package programmers.lv1;

import java.util.HashSet;
import java.util.Set;

public class N12940 {
	public static void main(String[] args) {
	int n = 3, m = 12;
		solution(n, m);
	}
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        Set<Integer> nSet = new HashSet<>(); 
        for (int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				nSet.add(i);
				nSet.add(n/i);
			}
		}
        for (int i = 1; i <= Math.sqrt(m); i++) {
        	if(m % i == 0) {
        		if(nSet.contains(m/i) && answer[0] < m/i) {
        			answer[0] = m/i;
        		}
        		if(nSet.contains(i) && answer[0] < i) {
        			answer[0] = i;
        		}
        	}
        }
        answer[1] = n * m / answer[0];
        return answer;
    }
}

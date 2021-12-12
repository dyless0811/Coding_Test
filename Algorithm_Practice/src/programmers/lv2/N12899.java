package programmers.lv2;

import java.util.ArrayList;

public class N12899 {
    public static void main(String[] args) {
		int n = 28;
//		int n = 2;
//		int n = 3;
//		int n = 4;
		solution(n);
	}
   
	public static String solution(int n) {
        String answer = "";
        ArrayList<String> list = new ArrayList<String>();
        while(n > 0) {
        	int t = n % 3;
        	if(t == 0) {
        		t = 4;
        		n -= 1;
        	}
        	list.add(Integer.toString(t));
        	n /= 3;
        }
        int lastIdx = list.size() - 1;
        for(int i = lastIdx;i>=0;i--) {
        	answer += list.get(i);
        }
        
        return answer;
    }
}

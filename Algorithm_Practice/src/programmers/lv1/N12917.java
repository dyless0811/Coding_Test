package programmers.lv1;

import java.util.Arrays;

public class N12917 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		solution(s);
	}
    public static String solution(String s) {
    	char[] cArr = s.toCharArray();
    	Arrays.sort(cArr);
    	StringBuffer sb = new StringBuffer(new String(cArr));
    	String answer = sb.reverse().toString();
    	return answer;
    }
}

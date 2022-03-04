package programmers.lv1;

import java.util.Arrays;
import java.util.Comparator;

public class N12915 {
	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
//		String[] strings = {"sun", "bed", "car"};
//		int n = 1;
		solution(strings, n);
	}
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> o1.charAt(n) == o2.charAt(n) ? 
        									o1.compareTo(o2) : 
        									o1.charAt(n) - o2.charAt(n));
        return strings;
    }
}

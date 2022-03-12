package programmers.lv1;

import java.util.Arrays;
import java.util.Comparator;

public class N12933 {
	public static void main(String[] args) {
		long n = 118372;
		solution(n);
	}
    public static long solution(long n) {
        long answer = 0;
        String number = String.valueOf(n);
        String[] numbers = new String[number.length()];
        for (int i = 0; i < numbers.length; i++) {
			numbers[i] = number.substring(i,i+1);
		}
        //String[] numbers = String.valueOf(n).split("");
        Arrays.sort(numbers, Comparator.reverseOrder());
        StringBuilder s = new StringBuilder();
        for (String string : numbers) {
			s.append(string);
		}
        answer = Long.parseLong(s.toString());
        return answer;
    }
}

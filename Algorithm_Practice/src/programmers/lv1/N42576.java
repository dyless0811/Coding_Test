package programmers.lv1;

import java.util.Arrays;

public class N42576 {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(solution(participant, completion));
	}
	
    public static String solution(String[] participant, String[] completion) {
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	for (int i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i])) return participant[i];
		}
    	
    	return participant[participant.length-1];
    }
}

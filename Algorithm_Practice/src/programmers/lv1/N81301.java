package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class N81301 {
	public static void main(String[] args) {
		solution("one4seveneight");
		solution("23four5six7");
		solution("2three45sixseven");
		solution("123");
	}
    public static int solution(String s) {
        int answer = 0;
        Map<String, String> map = new HashMap<>();
        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        for(Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			s = s.replace(key, val);
		}
        answer = Integer.parseInt(s);
        return answer;
    }
}


package programmers.lv2;

import java.util.ArrayList;
import java.util.HashMap;

public class N42888 {
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		solution(record);
	}
	
    public static String[] solution(String[] record) {
        final String ENTER = "님이 들어왔습니다.";
        final String LEAVE = "님이 나갔습니다.";
        HashMap<String, String> nickname = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();
        
        for (String rcd : record) {
        	
			String[] log = rcd.split(" ");
			switch(log[0]) {
				case "Leave":
					result.add(log[1]+"#"+LEAVE);
					break;
				case "Enter":
					result.add(log[1]+"#"+ENTER);
				case "Change":
					nickname.put(log[1], log[2]);
					break;
			}
		}
        
        String[] answer = new String[result.size()];
        
        for (int i = 0; i < answer.length; i++) {
        	
         	String userId = result.get(i).substring(0, result.get(i).indexOf("#"));
        	answer[i] = result.get(i).replace(userId+"#", nickname.get(userId));
		}
        
        return answer;
    }
}

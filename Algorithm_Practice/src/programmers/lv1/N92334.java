package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class N92334 {
	
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		solution(id_list, report, k);
	}
	
    public static int[] solution(String[] id_list, String[] report, int k) {
    	HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));
    	HashMap<String, Integer> reportMap = new HashMap<String, Integer>();
    	HashMap<String, Integer> answerMap = new HashMap<String, Integer>();
    	int[] answer = new int[id_list.length];
    	
    	for (String string : reportSet) {
    		String id = string.split(" ")[1];
    		Integer reported = reportMap.get(id);
			if (reported == null) {
    			reported = 0;
    		}
			reportMap.put(id, reported + 1);
		}
    	
    	ArrayList<String> banned = new ArrayList<>();
    	
    	for (Entry<String, Integer> entry : reportMap.entrySet()) {
			int val = entry.getValue();
			if(val >= k) {
				String key = entry.getKey();
				banned.add(key);
			}
		}
    	
    	for (String string : reportSet) {
			if(banned.contains(string.split(" ")[1])) {
	    		String id = string.split(" ")[0];
	    		Integer mail = answerMap.get(id);
				if (mail == null) {
	    			mail = 0;
	    		}
				answerMap.put(id, mail + 1);
			}
    	}
    	
    	for (int i = 0; i < id_list.length; i++) {
			answer[i] = answerMap.get(id_list[i]) == null ? 0 : answerMap.get(id_list[i]);
		}
    	
        return answer;
    }
}

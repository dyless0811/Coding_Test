package programmers.lv1;

public class N12919 {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		solution(seoul);
	}
    public static String solution(String[] seoul) {
    	int n = 0;
    	for (String s : seoul) {
			if(s.equals("Kim")) {
				break;
			}
			n++;
		}
    	
    	String answer = "김서방은 "+ n +"에 있다";
        return answer;
    }
}

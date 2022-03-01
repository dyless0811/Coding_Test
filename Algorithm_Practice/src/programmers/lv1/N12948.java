package programmers.lv1;

public class N12948 {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		solution(phone_number);
	}
    public static String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        for(int i=0;i<length-4;i++){
            answer += "*";
        }
        answer += phone_number.substring(length-4, length);
        
        //return phone_number.replaceAll(".(?=.{4})", "*"); 정규식 전방탐색 이용
        return answer;
    }
}

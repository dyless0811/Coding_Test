package programmers.lv1;

public class N12926 {
	public static void main(String[] args) {
//		String s = "a B z";
		String s = "AaZz";
//		int n = 4;
		int n = 25;
		solution(s, n);
		solution1(s, n); //이건 왜 안됨?
	}
    public static String solution1(String s, int n) {
        //'A' = 66, 'Z' = 91, 'a' = 98, 'z' = 122
    	String answer = "";
        char[] sArr = s.toCharArray();
        
        for (char c : sArr) {
			if(c<=91&&c+n>91 || c<=122&&c+n>122) {
				answer += String.valueOf((char)(c-26+n));
			} else if(c == 32) {
				answer += ' ';
			} else {
				answer += String.valueOf((char) (c+n));
			}
		}
        System.out.println(answer);
        return answer;
    }
	public static String solution(String s, int n) { 
		String answer = ""; 
		for(int i=0; i<s.length(); i++) { 
			char ch = s.charAt(i); 
			if(Character.isLowerCase(ch)) { 
				//소문자 
				ch = (char) ((ch - 'a' + n) % 26 + 'a'); 
			} else if(Character.isUpperCase(ch)) { 
				//대문자 
				ch = (char) ((ch - 'A' + n) % 26 + 'A'); 
			} 
			answer += ch; 
		} 
		System.out.println(answer);
		return answer;
	}		
}

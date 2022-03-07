package programmers.lv1;

public class N12918 {
	public static void main(String[] args) {
		String s = "1234";
		solution(s);
	}
    public static boolean solution(String s) {
        if(s.length()!=4 && s.length()!=6) {
        	return false;
        }
        for (char c : s.toCharArray()) {
			if(c < '0' || c > '9') {
				return false;
			}
		}
        return true;
//      return s.matches( "^[0-9]{4}|{6}$");
    }
}

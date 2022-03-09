package programmers.lv1;

public class N12916 {
	public static void main(String[] args) {
		
		String s = "pPoooyY";
		solution(s);
	}
	
    public static boolean solution(String s) {
        int p = 0;
        int y = 0;
        for (char c : s.toLowerCase().toCharArray()) {
			if(c == 'p') {
				p++;
			} else if(c == 'y') {
				y++;
			}
		} 
        return p==y;
    }
}

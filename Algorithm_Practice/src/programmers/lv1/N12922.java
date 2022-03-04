package programmers.lv1;

public class N12922 {
	public static void main(String[] args) {
		int n = 3;
		solution(n);
	}
    public static String solution(int n) {
        String watermelon = "수박";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n/2+1; i++) {
			s.append(watermelon);
		}
        
        return s.substring(0, n);
    }
}

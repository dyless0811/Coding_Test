package programmers.lv1;

public class N12901 {
	public static void main(String[] args) {
		int a = 5, b = 24;
		solution(a, b);
	}
    public static String solution(int a, int b) {
        int[] mDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int days = 0;
        for (int i = 0; i < a-1; i++) {
			days += mDays[i];
		}
        days += b;
        
        return daysOfWeek[days%7];
    }
}

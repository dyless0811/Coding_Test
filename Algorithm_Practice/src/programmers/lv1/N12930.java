package programmers.lv1;

public class N12930 {
	public static void main(String[] args) {
		String s = "try hello world";
		solution(s);
	}
    public static String solution(String s) {
        char[] cArr = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < cArr.length; i++) {
			if(cArr[i] == 32) {
				cnt = 0;
				continue;
			}
			if(cnt % 2 == 0) {
				cArr[i] = Character.toUpperCase(cArr[i]);
			} else {
				cArr[i] = Character.toLowerCase(cArr[i]);
			}
			cnt++;
		}
        System.out.println(new String(cArr));
        return new String(cArr);
    }
}

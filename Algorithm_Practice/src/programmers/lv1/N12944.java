package programmers.lv1;

public class N12944 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		solution(arr);
	}
    public static double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) {
			answer += i;
		}
        return answer/arr.length;
    }
}
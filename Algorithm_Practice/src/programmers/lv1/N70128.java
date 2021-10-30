package programmers.lv1;

public class N70128 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		solution(a, b);
	}
    public static int solution(int[] a, int[] b) {
    	int answer = 0;
        
        for (int i = 0; i < b.length; i++) {
			answer += a[i]*b[i];
		}
       
        return answer;
    }
}

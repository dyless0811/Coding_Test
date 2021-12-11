package programmers.lv2;

public class N12899 {
    public static void main(String[] args) {
		int n = 1;
//		int n = 2;
//		int n = 3;
//		int n = 4;
		solution(n);
	}
   
	public static String solution(int n) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        do {
        	int number = n % 3;
        	n /= 3;        	

        }while(n > 0);
        return answer;
    }
}

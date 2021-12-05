package programmers.lv1;

public class N82612 {
	public static void main(String[] args) {
		int price = 3, money = 20, count = 4;
		
		System.out.println(solution(price, money, count));;
	}
	
    public static long solution(int price, int money, int count) {
        long answer = money; 
        for (int i = 1; i <= count; i++) {
        	answer -= price*i;
        }
        return answer >= 0 ? 0 : answer*-1;
    }
}
package programmers.lv1;

public class N77484 {
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		solution(lottos, win_nums);
	}
	public static int[] solution(int[] lottos, int[] win_nums) {
		int hRank = 6, lRank = 6, hCount = 0, lCount = 0, zero = 0;
        
		for(int l : lottos) {
			zero += l == 0 ? 1 : 0;
        	for(int w : win_nums) {
        		lCount += l == w ? 1 : 0;
        	}
        }
		
		hCount = lCount + zero;
		
		hRank = hCount > 1 ? hRank-hCount+1 : hRank;
		lRank = lCount > 1 ? lRank-lCount+1 : lRank;
		
		int[] answer = {hRank, lRank};
        return answer;
    }
}
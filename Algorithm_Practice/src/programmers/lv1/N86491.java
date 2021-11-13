package programmers.lv1;

public class N86491 {
	public static void main(String[] args) {
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
		solution(sizes);
	}
	
    public static int solution(int[][] sizes) {
        int answer = 0;
        int l = 0;
        int s = 0;
        
        for (int[] size : sizes) {
			if(size[0] > size[1]) {
				l = size[0] > l ? size[0] : l;
				s = size[1] > s ? size[1] : s;
			} else {
				l = size[1] > l ? size[1] : l;
				s = size[0] > s ? size[0] : s;
			}
		}
        answer = l*s;
        
        return answer;
    }
}

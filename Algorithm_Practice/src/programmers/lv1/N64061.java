package programmers.lv1;

import java.util.Stack;

public class N64061 {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		solution(board, moves);
	}
	
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int move : moves) {
        	move = move-1;
			for (int i = 0; i < board.length; i++) {
				System.out.println("("+i+","+move+") = "+board[i][move]);
				if(board[i][move] != 0) {
					if(board[i][move] != stack.peek()) {
						stack.push(board[i][move]);
					} else {
						stack.pop();
						answer += 2;
					}
					board[i][move] = 0;
					break;
				}
			}
        }
        System.out.println(answer);
        return answer;
    }
}

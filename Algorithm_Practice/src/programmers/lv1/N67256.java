package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class N67256 {
    public static void main(String[] args) {
//    	int[] list = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    	int[] list = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
    	solution(list, "left");
	}
    public static String solution(int[] numbers, String hand) {
    	String answer = "";
        int key = 1;
        int ld = 0, rd = 0;
        Map<Integer, int[]> keypad = new HashMap<>();
        for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				int[] index = {j, i};
				keypad.put(key++, index);
			}
		}
        keypad.put(0,keypad.get(11));
        int[] lh = keypad.get(10), rh = keypad.get(12);
        
        for (int i : numbers) {
			int[] location = keypad.get(i);
			System.out.println(lh[0]+", "+lh[1]);
			System.out.println(rh[0]+", "+rh[1]);
			if(location[0] == 0) {
				answer += "L";
				lh = location;				
			}else if(location[0] == 2) {
				answer += "R";
				rh = location;				
			}else {
				int tx = location[0], ty = location[1];
				int lx = lh[0], ly = lh[1];
				int rx = rh[0], ry = rh[1];
				ld = Math.abs(lx-tx) + Math.abs(ly-ty);
				rd = Math.abs(rx-tx) + Math.abs(ry-ty);
				if(ld < rd) {
					answer += "L";
					lh = location;
				}else if(rd < ld) {
					answer += "R";
					rh = location;
				}else {
					if(hand.equals("left")) {
						answer += "L";
						lh = location;
					}else {
						answer += "R";
						rh = location;
					}
				}
			}
			System.out.println(i);
			System.out.println("ld = "+ld);
			System.out.println("rd = "+rd);
			System.out.println(answer);
			System.out.println();
		}
        System.out.println(answer);
        return answer;
    }
}

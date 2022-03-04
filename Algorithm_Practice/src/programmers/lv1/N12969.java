package programmers.lv1;

import java.util.Scanner;

public class N12969 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < a; i++) {
//        	s.append("*");
//        }
//        for (int i = 0; i < b; i++) {
//        	System.out.println(s.toString());
//        }
	}
}

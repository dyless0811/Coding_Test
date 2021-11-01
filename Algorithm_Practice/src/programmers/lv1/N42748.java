package programmers.lv1;


public class N42748 {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		
		solution(array, commands);
		
	}
	
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
        	if(commands[i][0] == commands[i][1]) {
        		answer[i] = array[commands[i][0]-1];
        		continue;
        	}
        	int[] tempArray = array.clone();
        	for (int k = 0; k < commands[i][2]; k++) {
        		for (int j = commands[i][1]-1; j >= commands[i][0]+k; j--) {
					int temp;
					if(tempArray[j]<tempArray[j-1]) {
						temp = tempArray[j-1];
						tempArray[j-1] = tempArray[j];
						tempArray[j] = temp;
					}
				}
			}
        	answer[i] = tempArray[commands[i][0]-1+commands[i][2]-1];
		}
        for (int i : answer) {
			System.out.print(i);
		}
        return answer;
    }
}

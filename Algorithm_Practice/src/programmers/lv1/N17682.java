package programmers.lv1;

public class N17682 {
	public static void main(String[] args) {
		String dartResult1 = "1S2D*3T";
		String dartResult2 = "1D2S#10S";
		String dartResult3 = "1D2S0T";
		String dartResult4 = "1S*2T*3S";
		String dartResult5 = "1D#2S*3S";
		String dartResult6 = "1T2D3D#";
		String dartResult7 = "1D2S3T*";
		
		solution(dartResult1);
		solution(dartResult2);
		solution(dartResult3);
		solution(dartResult4);
		solution(dartResult5);
		solution(dartResult6);
		solution(dartResult7);
	}
	
    public static int solution(String dartResult) {
    	int answer = 0;
    	int[] scores = new int[3];
    	String[] scales = new String[3];
    	String[] speciels = new String[3];
    	int index = 0;
    	boolean preIsOne = false;
    	
    	for (String c : dartResult.split("")) {
    		if(c.matches("[0-9]")) {
    			if(preIsOne && c.equals("0")) {
    				scores[index-1] = 10;
    				continue;
    			}
    			scores[index++] = Integer.parseInt(c);
    			if(c.equals("1"))
    				preIsOne = true;
    		} else if(c.matches("[A-Z]")) {
    			scales[index-1] = c;
    			preIsOne = false;
    		} else {
    			speciels[index-1] = c;
    			preIsOne = false;
    		}
		}
    	
    	for (int i = 0; i < scales.length; i++) {
			int scale = 1;
    		if(scales[i].equals("D"))
				scale = 2;
			else if(scales[i].equals("T"))
				scale = 3;
    		
			scores[i] = (int) Math.pow(scores[i], scale);
		}
    	
    	for (int i = 0; i < speciels.length; i++) {
			if(speciels[i] != null && speciels[i].equals("*")) {
				if(i == 0)
					scores[i] *= 2;
				else {
					scores[i] *= 2;
					scores[i-1] *= 2;
				}
			} else if(speciels[i] != null && speciels[i].equals("#")) {
				scores[i] *= -1;
			}
		}
    	
    	for (int i : scores) {
    		answer += i;
		}
    	
    	System.out.println("점수 = "+answer);
        return answer;
    }
}

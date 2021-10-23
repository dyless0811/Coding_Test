package programmers.lv1;

public class N72410 {
	public static void main(String[] args) {
		solution("...!@BaT#*..y.abcdefghijklm");
		solution("z-+.^.");
		solution("=.=");
		solution("123_.def");
		solution("abcdefghijklmn.p");
	}
	
	public static String solution(String new_id) {
		new_id = new_id.toLowerCase();
		System.out.println(new_id);
		
		new_id = new_id.replaceAll("[^a-z0-9._-]", "");
		System.out.println(new_id);
		
		while(new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		System.out.println(new_id);
		
		String f = new_id.substring(0, 1);
		if(f.equals(".")) {
			new_id = new_id.substring(1,new_id.length());			
		}
		
		System.out.println(new_id);
		
		new_id = new_id.equals("") ? "a" : new_id;
		System.out.println(new_id);
		
		new_id = new_id.length() >= 16 ? new_id.substring(0,15) : new_id;
		System.out.println(new_id);
		
		String l = new_id.substring(new_id.length()-1, new_id.length());
		if(l.equals(".") && new_id.length() > 1) {
			new_id = new_id.substring(0,new_id.length()-1);			
		}
		
		while(new_id.length() <= 2 ) {
			new_id = new_id + new_id.substring(new_id.length()-1, new_id.length());
		}
		System.out.println(new_id);
		
        String answer = new_id;
        return answer;
    }
}

package stud;


public class cc36 {
	
	public static void main(String[] args) {
		
		cc36 c = new cc36();
		String answer = c.solution(3);
		System.out.println(answer);
		
	}
	public String solution(int n) {
		
		String answer ="";

		for(int i = 0; i < n; i++) {
			if(i % 2 ==0) {
				answer += "수";
			}else {
				answer += "박";
			}	
		}
		return answer;
	}
	
	
}
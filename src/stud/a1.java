package stud;

public class a1 {
	
	static int i = 1;
	
	
	
	
	
	public static void main(String[] args) {

		
		String[] arr ={"O", "O", "O", "O", "X", "O", "O", "O", "O", "X", "O", "O", "O", "O", "X"} ;
		a1 a = new a1();
		  
		
		
		
		String name;
		
		
		
		System.out.println("출력 결과 : "+a.solution(arr));
		
		
		
	}

	int solution(String[] arr) {
		
		int answer = 0;
		int score = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals("O")) {
				score+=1;
			}else if(arr[i].equals("X")) {
				score = 0;
			}
			System.out.println("["+i+"]번째 score : " + score);
			answer += score;
			System.out.println("["+i+"]번째 answer : " + answer);

		}
		
		return answer;
	}
	
	
}

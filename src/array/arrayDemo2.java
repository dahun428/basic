package array;

public class arrayDemo2 {

	public static void main(String[] args) {
		
		int[] scores = new int[6];
				
		for(int i = 0; i < scores.length; i++) {
			scores[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i; j++ ) {
				if(scores[i] == scores[j]) {
					i--;
					break;
				}
			}
			System.out.println("로또 번호 ["+(i+1)+"] : " + scores[i]);
		}
	
		
	}

}

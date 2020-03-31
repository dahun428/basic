package array;

public class arrayDemo4 {

	public static void main(String[] args) {
		
		int[][]scores = new int[2][3];
		scores[0][0] = 60;
		scores[0][1] = 80;
		scores[0][2] = 90;
		
		scores[1][0] = 50;
		scores[1][1] = 40;
		scores[1][2] = 40;
		
		int total1 = 0;
		for(int i= 0; i <3; i++) {
			total1 += scores[0][i];
		}
		System.out.println("total1 : " + total1);
		
		int total2 = 0;
		for(int i =0; i <3; i++) {
			total2 += scores[1][i];
		}
		System.out.println("total2 : " + total2);
		
	}
	

}

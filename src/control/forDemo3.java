package control;

public class forDemo3 {

	public static void main(String[] args) {

	int n1 = 0;
	int n2 = 0;
	int n3 = 0;
	int n4 = 0;
	int n5 = 0;
	int n6 = 0;
	int[] array = new int[6];
	
	System.out.println("로또 번호");
	for(int i = 0; i < array.length; i++) {
		int num = (int)(Math.random()*45 + 1);
		
		if(num == n1 || num == n2 || num == n3 || num == n4 || num == n5 || num == n6) {
		
			i--;
			
		}else {
			for(int j = 0; j < i; j++) {
				array[j] = num;
			}
		}
		System.out.print(" "+array[i]);
	}
	
		
	}

}

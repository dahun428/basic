package operate;

public class operator4 {

	public static void main(String[] args) {

		
		//대입 연산자(이항연산자)
		// = += -= *= /= %=
		// 대입연산자는 모든 연산자들 중에서 연산 우선순위가 가장 낮은 연산자다.
		
		int num1 = 10;
		num1 = num1 + 1;
		
		int num2 = 10;
		num2 = num2 + 2;
		System.out.println("num2: " + num2);

		num2 = num2 + 2;
		System.out.println("num2: " + num2);

		num2 = num2 + 2;
		System.out.println("num2: " + num2);
		
		int num3 = 10;
		num3 += 2;
		System.out.println("num3 : " + num3);
		num3 += 2;
		System.out.println("num3 : " + num3);
		num3 += 2;
		System.out.println("num3 : " + num3);
	}

}

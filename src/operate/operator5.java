package operate;

public class operator5 {

	public static void main(String[] args) {

		
		//비교 연산자(이항연산자)
		// > < >= <= == !=
		//비교 연산자 조건문과 반복문의 조건식으로 사용된다.
		//비교 연산자의 연산 결과는 항상 true / false 중 하나다.
		
		int num1 = 20;
		int num2 = 30;
		boolean result = num1 > num2;
		System.out.println(result);
		
		boolean result2 = num1 == num2; //연산자의 우선순위에 대한 가독성이 좋지않다.
		boolean result3 = (num1 != num2); // 연산자의 우선순위에 대한 가독성이 좋다.
		System.out.println("두수가 동일한가?" + result2);
		System.out.println("두수가 동일하지 않는가? " + result3);
		
		String a = new String("안녕");
		String b = new String("안녕");
		
		System.out.println(a == b);
		//equals 를 사용하여 비교해야한다.
		System.out.println(a.equals(b));
	}

}

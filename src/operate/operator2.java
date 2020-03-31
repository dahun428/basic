package operate;

public class operator2 {

	public static void main(String[] args) {

		
		//증감 연산자
		//아래의 기술된 모든 수행문은 일부는 비추천 수행문
		
		int num1 = 10;
		int num2 = 20;
		
		// 증감 연산자를 비교 연산자와 같이 사용한 경우
		boolean result1 = num1++ > 10;
		boolean result2 = ++num1 > 10;
		
		System.out.println(result1);
		System.out.println(result2);
		
		// 증감연산자를 비교 연산자와 같이 사용하지 않은 경우
		int num3 = 10;
		int num4 = 10;
		num3++;
		++num4;
		
		boolean result3 = num3 > 10;
		boolean result4 = num4 > 10;
		System.out.println(result3);
		System.out.println(result4);
	}

}

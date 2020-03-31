package array;

public class arrayDemo {

	public static void main(String[] args) {

/*
 * int[] numbers = new int[5]
 * int[] numbers = {};
 * int[] numbers = new int[]{}
 *
 * -배열을 생성할 때 배열의 길이만 지정해서 배열을 생성하면 배열의 각요소는 해당 데이터타입의 기본값으로 초기화 되어있다.
 *		
 * 기본 데이터 타입별 기본값
 * 정수(byte, short, int, long ) --> 0
 * 실수(float, double) --> 0.0
 * 문자(char) --> \u0000
 * 논리(boolean) --> false
 * *참조데이터 타입읙 ㅣ본값
 * 	기본데이터 타입을 제외한 모든 데이터타입의 기본값은 null이다.
 * 	모든 참조타입의 변수에 null 값을 대입할 수 있다.
 *  null은 참조변수가 객체를 더이상 참조하지 못하게 하는 값이다.
 */
		
		//정수형 배열
		int[] num1 = new int[3];
		for(int i : num1) {
			System.out.println( i + "번째 정수 : "+ num1[i] );
		}
		//실수형 배열
		double[] num2 = new double[3];
		for(int i = 0; i < num2.length; i++) {
			System.out.println(i+"번째 실수 : "+num2[i]);
		}
		//문자열 배열
		String[] words = new String[3];
		for(int i = 0; i < words.length; i++) {
			System.out.println(i+"번째 문자열  : " + words[i]);
		}
		
		//정수형 배열
		int[]scores = {10,30,100};
		//실수형 배열
		double[]rates = {0.05, 0.01};
		//String 형 배열
		String [] names = {"홍길동","김유신"};
	}

}

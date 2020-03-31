package array;

public class arrayDemo1 {

	public static void main(String[] args) {
		//배열의 값 조회/변경하기
		
		//정수형 배열 생성
		int[] scores = new int[3];
		scores[0] = 90;
		scores[1] = 70;
		scores[2] = 60;
		//배열의 각 욧에 저장된 변수값 사용하기
		int total = scores[0] + scores[1] + scores[2];
		System.out.println("국어점수 : " + scores[0]);
		System.out.println("영어점수 : " + scores[1]);
		System.out.println("수학점수 : " + scores[2]);
		System.out.println("총점 : " + total);
		
		//String형 배열 생성
		String[] names = {"이순신","강감찬","홍길동"};
		System.out.println("0번째 문자열" + names[0]);
		System.out.println("1번째 문자열" + names[1]);
		System.out.println("2번째 문자열" + names[2]);
		
		names[1] = "김유신";
		System.out.println("0번째 문자열" + names[0]);
		System.out.println("1번째 문자열" + names[1]);
		System.out.println("2번째 문자열" + names[2]);
		
		
	}

}

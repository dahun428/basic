package array;

public class arrayDemo3 {

	public static void main(String[] args) {
		
		//배열의 값 조회/출력하기
		// enhanced - for 문을 사용
		// -배열 , Collection 과 같은 값을 여러개 저장하는 저장소에서
		//  각 요소의 값을 하나씩 조회할 때 사용하는 for 문이다.
		// -반드시, 배열, collection을 대상으로만 사용해야한다.
		// for(타입 변수명 : 배열){
		// 	수행문;
		// }
		//* 지정된 배열의 처음부터 끝까지 저장된 값을 하나씩 순서대로 꺼내서
		
		// * 배열 : 조회할 값을 가지고 있는 배열
		// * 타입 : 배열에 저장된 값의 타입
		// * 변수 : 배열에 저장된 값이 순서대로 저장된다.
	
		
		int[] scores= {60,70,80};
		for(int num : scores) {
			System.out.println(num);
		}
	}

}

package operate;

public class operator7 {

	public static void main(String[] args) {
		
		//논리 연산자(이항 연산자)
		// && 	||	 !
		// and 	or	not
		//논리 연산자의 피연산자는 boolean 값을 제공하는 연산식(혹은 표현식)이어야 한다.
		//논리연산자의 연산 결과는 항상 true/false 중에 하나다.
		//논리연산자는 업무로직의 구현에 필수적으로 사용된다.
		
		//주행거리가 50000km이상이거나 구입기간이 5년이 넘은 경우 유상처리한다. (OR)
		
		int distance = 60000;
		int userYear = 3;
		boolean isPay = (distance >= 50000 || userYear > 5);
		System.out.println("유상수리 여부 : " + isPay);
		
		
		//당일 구매금액이 100만원이상이고, 100번째, 200번째, 300번째, ....에
		//방문한 고객은 사은품을 지급(AND)
		
		int orderPrice = 140000;
		int count = 157;
		boolean present = (orderPrice > 1000000) && (count%200 == 0);
		System.out.println("사은품 지급 여부 : " + present);
		
		
		//시험성적이 90점 이상이고, 학년석차가 3등 이내인 학생에게 전액장학금을 지원한다.(AND)
		int score = 94;
		int ranking = 2;
		boolean give = (score > 90) && (ranking <= 3);
		System.out.println("장학금 지급 여부 :"+give);
		
		
	}

}

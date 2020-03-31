package oop1;

public class person2 {

	public static void main(String[] args) {
		
		/*
		 * Person 객체를 여러개 담는 배열을 사용해보기
		 */
		
		//person객체에 3개 담을 수 있는 배열을 생성해서 people 에 대입하기
		person[] people = new person[3];
		
		person p1 = new person(); // p1은 person 객체의 주소값을 가지고 있다.
		person p2 = new person(); // p2은 person 객체의 주소값을 가지고 있다.
		person p3 = new person(); // p3은 person 객체의 주소값을 가지고 있다.
		
		p1.name="강감찬";
		p1.email = "kang@gmail.com";
		p1.age = 20;
		p2.name="이순신";
		p2.email = "lee@gmail.com";
		p2.age = 21;
		p3.name="김유신";
		p3.email = "kim@gmail.com";
		p3.age = 23;
		
		people[0] = p1;
		people[1] = p2;
		people[2] = p3;
		
		//people 배열에 저장된 모든 person객체의 속성을 출력하기
		for(int i = 0; i < people.length; i++) {
			person p = people[i]; // p에는 person 객체의 주소값이 순서대로 대입된다.
			System.out.println("");
		}
	}
}

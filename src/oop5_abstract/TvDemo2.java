package oop5_abstract;

public class TvDemo2 {

	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		IPTv iptv = new IPTv();
		NetflixTv netflixTv = new NetflixTv();
		NetflixTv netflixTv2 = new NetflixTv();
		
		CaptionTv c = new CaptionTv();
		
		//Object에 정의된 toString()메소드 사용하기
		//toString()메소드는 ""클래스 전체이름@해시코드" 로 구성된 문자열을 반환
		String desc1 = tv.toString();
		String desc2 = iptv.toString();
		String desc3 = netflixTv.toString();
		String desc4 = netflixTv2.toString();
		
		
		System.out.println(desc1);
		System.out.println(desc2);
		System.out.println(desc3);
		System.out.println(desc4);
		
		
		//자바는 참조변수의 값을 출력해 볼 수 없다.
		//참조변수의 값을 출력하는 대신, 참조변수가 참조하는 객체의 toString()를 실행
		System.out.println(tv);
		System.out.println(iptv);
		System.out.println(netflixTv);
		System.out.println(netflixTv2);
		
		System.out.println(tv.toString());
		System.out.println(iptv.toString());
		System.out.println(netflixTv.toString());
		System.out.println(netflixTv2.toString());
		
		String str = "df";
		System.out.println("str : "+str);
		
	}
	
}

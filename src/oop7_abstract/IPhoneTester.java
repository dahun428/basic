package oop7_abstract;

public class IPhoneTester {
	
	void testIphone(IPhone p) {
		p.applemusic();
		p.siri();
		
		//p 에 전달된 객체가 IPhone 8 이라면 지문인식기능
		if(p instanceof IPhone8) {
			
			IPhone8 i8 = (IPhone8) p; 
			//(IPhone8) p <== p가 참조하는 객체에서 IPhone8객체를 찾아서(형변환)
			i8.fingerScan();
			System.out.println("아이폰8의 지문인식기능 테스트완료");
		}else if(p instanceof IPhoneX) {
			System.out.println();
			IPhoneX ix = (IPhoneX) p;
			ix.faceScan();
			System.out.println("아이폰x의 얼굴인식 기능 테스트 완료");
		}
		if(p instanceof IPhone11) {
			((IPhone11) p).tripleCamera();
			System.out.println("아이폰11의 트리플카메라 테스트 완료");
		}
		
		
		//p 에 전달된 객체가 IPhone X 이라면 얼굴인식 기능 실행해보기
		//p 에 전달된 객체가 IPhone 11이라면 카메라 기능 실행해보기
	}
}

package oop2;
/**
 * 여러가지 구구단 출력을 제공하는 클래스. 
 * @author JHTA
 *
 */
public class Gugudan {

	/**
	 * 2단부터 9단까지 출력한다. 
	 */
	void print99dan() {
		print99danByRange(2, 9);
	}
	/**
	 * 지정된 단에 해당하는 구구단을 출력한다.
	 * @param dan 출력할 단의 숫자
	 */
	void print99danByNumber(int dan) {
		
		print99danByRange(dan, dan);
	}
	/**
	 * 지정된 시작번호부터 끝번호까지의 구구단을 출력한다.
	 * @param begin 시작번호
	 * @param end 끝번호
	 */
	void print99danByRange(int begin, int end) {
		
		System.out.println("-------" + begin +" 부터 " + end + "까지 구구단 출력 ---------");
		for(int i = 1; i < 10; i++) {
			for(int j = begin; j <= end; j++) {
				System.out.print(j + " * " + i + "  =  " + i*j +"\t");
			}
			System.out.println();
		}
	}
	
	
}

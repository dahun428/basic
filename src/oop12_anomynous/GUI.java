package oop12_anomynous;

public class GUI {
	public static void main(String[] args) {

		MouseClick c1 = ()->System.out.println("새창을 연다.");
		MouseClick c3 = ()->System.out.println("파일 탐색 창을 연다.");

		
		MouseClick c2 = new MouseClick() {
			public void handle() {
				System.out.println("새창을 연다.");
			}
		};
		
		MouseClick c4 = new MouseClick() {
			
			public void handle() {
				System.out.println("파일 탐색 창을 연다.");
			}
		};
		
		c3.handle();
		c4.handle();
		c1.handle();
		c2.handle();
		
		
	}
}

package oop2;

public class HealthDemo {

	public static void main(String[] args) {
		
		Health h = new Health();
		double b = h.bmi(65, 1.8);
		System.out.printf("%.2f", b);
		String c =h.bmiText(65, 1.8);
		System.out.printf("%s", c);
	}
}

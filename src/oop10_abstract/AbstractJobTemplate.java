package oop10_abstract;

public abstract class AbstractJobTemplate {
	
	
		void setup() {
			System.out.println();
			System.out.println("##Before Workface Start##");
			System.out.println("DB Server Connecting .. on demand .. .. ..");
			System.out.println("DB Server Connecting Complete!");
			System.out.println("##Before workface Complete##");
			System.out.println();
		}
		abstract void work();
		
		void destroy() {
			System.out.println();
			System.out.println("##After Workface Start##");
			System.out.println("DB Server distrupt connecting ... on demand .. . .. .");
			System.out.println("DB Server Terminated Complete!");
			System.out.println("##After Workface Complete##");
			System.out.println();
		}
	
		//작업을 처리하기 위한 절차대로 메소드를 
		void run() {
			setup();
			work();
			destroy();
		}
	
}

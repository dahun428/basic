package oop10_abstract;

public class JobDemo {
	public static void main(String[] args) {
		InsertJob j = new InsertJob();
		j.run();
		RetrieveJob r = new RetrieveJob();
		r.run();
	}
}

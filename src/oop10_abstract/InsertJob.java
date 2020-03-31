package oop10_abstract;

public class InsertJob extends AbstractJobTemplate{
	@Override
	void work() {
		System.out.println("Add new information on DB");
	}
}

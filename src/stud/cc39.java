package stud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cc39 {
	
	String name;
	String email;
	int age;
	double weight;
	double height;
	
	cc39(){}
	
	cc39(String name , String email){
		this(name, email, 0, 0.0, 0.0);
	}
	cc39(String name , String email, int age){
		this(name, email, age, 0.0, 0.0);
	}
	
	
	
	public cc39(String name, String email, int age, double weight, double height) {
	
		this.name = name;
		this.email = email;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}






	public static void main(String[] args) {
		cc39 c = new cc39("정다훈","d");
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.height);
		
	}
}
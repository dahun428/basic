package oop7_abstract;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneDemo2 {

	public static void main(String[] args) {

		 Phone p = new IPhone8();
		 System.out.println("phone : "+(p instanceof Phone));
		 System.out.println("Feacturephone : "+(p instanceof FeacturePhone));
		 System.out.println("Smartphone : "+(p instanceof SmartPhone));
		 System.out.println("Iphone : "+(p instanceof IPhone));
		 System.out.println("Galaxy : "+(p instanceof Galaxy));
		 System.out.println("phone8 : "+(p instanceof IPhone8));
		 System.out.println("phoneX : "+(p instanceof IPhoneX));
		 System.out.println("phone11 : "+(p instanceof IPhone11));
		 
	}

}

package oop5_abstract;

public class CaptionTv extends Tv{
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

package oop5_abstract;

public class NetflixTv extends IPTv{
	
	String membership;
	
	void watchMovie(String title) {
		if("basic".equals(membership)) {
			System.out.println("표준 화질로 시청중");
		}else if("standard".equals(membership)) {
			System.out.println("HD화질로 시청 중");
		}else if("premium".equals(membership)) {
			System.out.println("UHD 4k화질로 시청 중");
		}
	}
	
}

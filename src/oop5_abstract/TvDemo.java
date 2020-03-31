package oop5_abstract;

public class TvDemo {

	public static void main(String[] args) {

		Tv tv = new Tv();
		
		tv.power();
		tv.channelUp();
		tv.channelUp();
		
		IPTv iptv = new IPTv();
		
		iptv.power();
		iptv.channelDown();
		iptv.internet("www.naver.com");
		
		NetflixTv netflixTv = new NetflixTv();
		
		netflixTv.channelDown();
		netflixTv.internet("www.netflix.com");
		netflixTv.watchMovie("극한직업");
		
		CaptionTv c = new CaptionTv();
		c.channelDown();
		c.power();
		c.displayCaption("what");
	}

}

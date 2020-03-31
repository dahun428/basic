package oop11_interface;

public class TvDemo {

	
	public static void main(String[] args) {
		NormalMonitor m1 = new NormalMonitor();
		HDMonitor m2 = new HDMonitor("4k");
		CinemaMonitor m3 = new CinemaMonitor();
		LCDCinemaMonitor m4 = new LCDCinemaMonitor();
		
		NormalTv tv1 = new NormalTv(m1);
		NormalTv tv2 = new NormalTv(m2);
		NormalTv tv3 = new NormalTv(m3);
		NormalTv tv4 = new NormalTv(m4);
		
//		CinemaTv tv5 = new CinemaTv(m1);
//		CinemaTv tv6 = new CinemaTv(m2); 	error
		CinemaTv tv7 = new CinemaTv(m3);
		CinemaTv tv8 = new CinemaTv(m4);
		
		
		tv2.watch();
		tv1.watch();
		
	}
}

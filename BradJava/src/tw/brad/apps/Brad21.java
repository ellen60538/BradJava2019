package tw.brad.apps;

import tw.org.iii.apps.java.Bike;
import tw.org.iii.apps.tools.Scooter;

public class Brad21 {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();
		System.out.println(b1.getSpeed());
		Scooter s1 = new Scooter();
		s1.setGear(4);
		s1.upSpeed();s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSpeed());
	}
}
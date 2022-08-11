package interfac;

public class Sparepart implements Spare {

	public void bike() {

		int chain = 40;
		int headlight = 50;
		int breake = 35;

		System.out.println("spare part of no bike chain:" + chain);
		System.out.println("spare part of no bike headlight:" + headlight);
		System.out.println("spare part of no bike breake:" + breake);

	}

	public void car() {
		int wheel = 28;
		int sidemirror = 34;
		int chainspare = 33;

		System.out.println("spare part of no car wheel:" + wheel);
		System.out.println("spare part of no car side mirror:" + sidemirror);
		System.out.println("spare part of no car chainpare:" + chainspare);

	}

	public void bus() {

		int staring = 34;
		int door = 55;
		int frontglass = 40;

		System.out.println("spare part of no bus straing :" + staring);
		System.out.println("spare part of no bus door:" + door);
		System.out.println("spare part of no bus frontglass:" + frontglass);

	}

	public static void main(String[] args) {
		Sparepart sp = new Sparepart();
		sp.bike();
		sp.bus();
		sp.car();

	}

}

package abstraction;

public class Car extends Vehicle{

	public void openDoors() {
		System.out.println("Mobil sedang membuka pintu");
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Mobil sedang di starter");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Mobil sedang berjalan");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Mobil stop");
	}

}

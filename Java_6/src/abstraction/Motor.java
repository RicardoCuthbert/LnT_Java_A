package abstraction;

public class Motor extends Vehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Motor sedang di starter");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Motor sedang berjalan");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Motor stop");
	}

}

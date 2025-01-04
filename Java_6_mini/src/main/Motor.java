package main;

public class Motor extends Vehicle {

	private int handler;

	public Motor(String brand, int year, int handler) {
		super(brand, year);
		this.handler = handler;
		// TODO Auto-generated constructor stub
	}

	public int getHandler() {
		return handler;
	}

	public void setHandler(int handler) {
		this.handler = handler;
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}

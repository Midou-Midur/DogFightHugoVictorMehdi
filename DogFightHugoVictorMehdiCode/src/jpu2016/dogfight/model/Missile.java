package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private static String image ="";
	private final int SPEED = 4;
	private final int WIDTH = 30;
	private final int HEIGHT = 10;
	private final int MAX_DISTANCE_TRAVELED = 1400;
	private int distanceTraveled = 0;

	public Missile(Direction direction, Dimension dimension) {
		super(direction, position, dimension, speed, width, height,image);
	}
	
	public int getWidthADirection(Direction direction) {
		return HEIGHT;

	}

	public int getHeightWithADirection(Direction direction) {
		return HEIGHT;

	}

	public void move() {

	}

	public boolean isWeapon() {
		return false;

	}

	public int getSPEED() {
		return SPEED;
	}

	public int getWIDTH() {
		return WIDTH;
	}

	public int getMAX_DISTANCE_TRAVELED() {
		return MAX_DISTANCE_TRAVELED;
	}

	public int getDistanceTraveled() {
		return distanceTraveled;
	}

	public void setDistanceTraveled(int distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}
}

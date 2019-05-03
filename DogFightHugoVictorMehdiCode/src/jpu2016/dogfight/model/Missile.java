package jpu2016.dogfight.model;

import org.omg.CORBA.Object;

public class Missile extends Mobile {
	private static String image = "missile";
	private final int SPEED = 4;
	private final int WIDTH = 30;
	private final int HEIGHT = 10;
	private final int MAX_DISTANCE_TRAVELED = 1400;
	private int distanceTraveled = 0;

	public Missile(Direction direction, Dimension dimension) {
		super(direction, position, dimension, speed, width, height, image);
		dimension = new Dimension(dimension);
	}

	public int getWidthADirection(Direction direction) {
		return HEIGHT;

	}

	public int getHeightWithADirection(Direction direction) {
		return HEIGHT;

	}

	@Override
	public void move() {
		String move = "";
		int x = 0, y = 0;
		switch (move) {
		case "UP":
			y += 1;
			moveUp();
			break;
		case "RIGHT":
			x += 1;
			moveRight();
			break;
		case "DOWN":
			y -= 1;
			moveDown();
			break;
		case "LEFT":
			x -= 1;
			moveLeft();
			break;
		default:
			System.err.println("Mouvement impossible");
			break;
		}
	}

	public boolean isWeapon() {
		Object weapon = null;
		if (weapon instanceof Missile) {
			return true;
		} else {
			return false;
		}
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

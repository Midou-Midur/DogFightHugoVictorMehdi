package jpu2016.dogfight.model;

public class Cloud extends Mobile {
	private static String image ="";
	private final int SPEED = 1, WIDTH = 300, HEIGHT = 150;
	private final String IMAGE = "cloud";

	public Cloud(Direction direction, Dimension dimension) {
		super(direction, position, dimension, speed, width, height,image);
	}

	public int getSPEED() {
		return SPEED;
	}

	public int getWIDTH() {
		return WIDTH;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}

	public String getIMAGE() {
		return IMAGE;
	}
}

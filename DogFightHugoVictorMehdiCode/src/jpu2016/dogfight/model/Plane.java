package jpu2016.dogfight.model;

public class Plane extends Mobile{
	private static String image = "";
	private static int SPEED = 2, WIDTH = 100, HEIGHT = 30;
	private int player;
	
	public Plane(int player, Direction direction, Position position, String image)  {
		super(direction, position, dimension, speed, width, height,image);
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}
	public boolean isPlayer(int player) {
		return false;
	}
	public boolean hit() {
		return false;
	}
}

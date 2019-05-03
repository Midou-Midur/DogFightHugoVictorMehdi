package jpu2016.dogfight.model;

public class Position {
	private double x, y, maxX, maxY;
	Position position;
	
	public Position(double x, double y, double maxX, double maxY) {
		this.setX(x);
		this.setY(y);
		this.maxX = maxX;
		this.maxY = maxY;
	}
	public Position(Position position) {
		this.position = position;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}
}

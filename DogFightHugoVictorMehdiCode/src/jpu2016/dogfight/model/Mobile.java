package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

public class Mobile implements IMobile {
	protected static int speed;
	protected static int width;
	protected static int height;
	private Direction direction;
	private ArrayList<Image> Images;
	protected static Dimension dimension;
	protected static Position position;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, int width, int height,
			String image) {
		Mobile.dimension = dimension;
		this.direction = direction;
		Mobile.position = position;
		Mobile.speed = speed;
		Mobile.width = width;
		Mobile.height = height;
		Images = new ArrayList<Image>();
		
	}

	@Override
	public Direction getDirection() {
		return this.direction;
	}

	@Override
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	@Override
	public Point getPosition() {
		return null;

	}

	@Override
	public Dimension getDimension() {
		return Mobile.dimension;
	}

	@Override
	public int getSpeed() {
		return Mobile.speed;
	}

	@Override
	public int getWidth() {
		return Mobile.width;

	}

	@Override
	public int getHeight() {
		return Mobile.height;

	}

	@Override
	public void move() {

	}

	@Override
	public void placeInArea(IArea area) {

	}

	@Override
	public boolean isPlayer(int player) {
		return false;

	}

	public void moveUp() {

	}

	public void moveRight() {

	}

	public void moveDown() {

	}

	public void moveLeft() {

	}

	public Color getColor() {
		return null;

	}

	public IDogfightModel getDogfightModel() {
		return null;

	}

	@Override
	public void setDogfightMdel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub

	}

	public boolean hit() {
		return false;
	}

	public boolean isWeapon() {
		return false;
	}

	public Image getImage() {
		return null;

	}

}

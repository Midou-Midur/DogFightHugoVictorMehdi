package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

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
		Image jetDroit, jetGauche, missile;
		try {
			jetDroit = ImageIO.read(new File("jetADroite.jpg"));
			jetGauche = ImageIO.read(new File("jetAGauche.jpg"));
			missile = ImageIO.read(new File("missile.jpg"));
			Images.add(jetGauche);
			Images.add(jetDroit);
			Images.add(missile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isPlayer(int player) {
		return false;

	}

	public void moveUp() {
		this.direction = Direction.UP;
	}

	public void moveRight() {
		this.direction = Direction.RIGHT;
	}

	public void moveDown() {
		this.direction = Direction.DOWN;
	}

	public void moveLeft() {
		this.direction = Direction.LEFT;
	}

	//Composant Vue
	public Color getColor() {
		return null;

	}

	public IDogfightModel getDogfightModel() {
		return null;

	}

	@Override
	public void setDogfightMdel(DogfightModel dogfightModel) {

	}

	public boolean hit() {
		return false;
	}

	public boolean isWeapon() {
		return false;
	}

	public Image getImage() {
		Image sky = null;
		try {
			sky = ImageIO.read(new File("sky.pjg"));
			Images.add(sky);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sky;

	}
}

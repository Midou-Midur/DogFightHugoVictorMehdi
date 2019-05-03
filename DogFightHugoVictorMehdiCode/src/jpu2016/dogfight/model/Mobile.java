package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
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
	public Direction getDirection() {
		return this.direction;
	}

	@Override
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	//
	@Override
	public Point getPosition() {
		Point position = null;
		return position;

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
		Image jetDroit, jetGauche;
		try {
			jetDroit = ImageIO.read(new File("jetADroite.jpg"));
			jetGauche = ImageIO.read(new File("jetAGauche.jpg"));
			Images.add(jetGauche);
			Images.add(jetDroit);
			if (player == 1) {
				System.out.println(jetGauche);
			} else {
				System.out.println(jetDroit);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	// gérer les déplacements des avions
	// Composant Vue
	@Override
	public void move() {

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

	// Composant Vue
	public Color getColor() {
		return null;

	}

	public IDogfightModel getDogfightModel() {
		return null;

	}

	//
	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {

	}

	/*
	 * (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#hit()
	 * Afin de savoir si un avion touche un autre,
	 * il faut que le missile lancé le touche : position(avions2)=missile(avions1) et inversement
	 */
	public boolean hit() {
		Image missile = null, jetDroit = null, jetGauche = null;
		boolean hit = false;
		try {

			missile = ImageIO.read(new File("missile.jpg"));	
			jetGauche = ImageIO.read(new File("jetAGauche.jpg"));
			missile = ImageIO.read(new File("missile.jpg"));
			Images.add(missile);
			Images.add(jetGauche);
			Images.add(jetDroit);
			
			

		} catch (IOException e) {
			e.printStackTrace();
		}
		return hit;
	}

	// S'il y a une arme, la montrer
	public boolean isWeapon() {
		Image missile, check = null;
		boolean weapon = false;
		try {

			missile = ImageIO.read(new File("missile.jpg"));
			Images.add(missile);
			if (check.equals(missile) && (weapon = true)) {
				System.out.println(missile);
			} else {
				System.err.println("Pas de missile detecte");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return weapon;
	}

	// On récupère les images servant de sprite
	public Image getImage() {
		Image jetDroit = null, jetGauche, missile, sky;
		Image choix = null;
		try {
			jetDroit = ImageIO.read(new File("jetADroite.jpg"));
			jetGauche = ImageIO.read(new File("jetAGauche.jpg"));
			missile = ImageIO.read(new File("missile.jpg"));
			sky = ImageIO.read(new File("sky.jpg"));
			Images.add(jetGauche);
			Images.add(jetDroit);
			Images.add(missile);
			Images.add(sky);
			if (choix.equals(sky)) {
				System.out.println(choix);
			} else if (choix.equals(missile)) {
				System.out.println(choix);
			} else if (choix.equals(jetGauche)) {
				System.out.println(choix);
			} else if (choix.equals(jetDroit)) {
				System.out.println(choix);
			} else {
				System.err.println("Aucun sprite reconnu !");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return choix;

	}
}

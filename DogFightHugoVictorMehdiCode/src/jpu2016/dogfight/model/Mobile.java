package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.omg.CORBA.Object;

public class Mobile implements IMobile {

	protected static int speed;
	protected static int width;
	protected static int height;
	private Direction direction;
	protected ArrayList<Image> Images;
	protected static Dimension dimension;
	protected static Position position;
	// Déclaration d'un DogfightModel
	protected static DogfightModel dogFightModel;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, int width, int height,
			String image) {
		Mobile.dimension = dimension;
		this.direction = direction;
		Mobile.position = position;
		Mobile.speed = speed;
		Mobile.width = width;
		Mobile.height = height;
		Images = new ArrayList<Image>();
		Image jetDroit, jetGauche, missile, sky;
		try {
			jetDroit = ImageIO.read(new File("jetADroite.jpg"));
			jetGauche = ImageIO.read(new File("jetAGauche.jpg"));
			missile = ImageIO.read(new File("missile.jpg"));
			sky = ImageIO.read(new File("sky.jpg"));

			Images.add(jetGauche);
			Images.add(jetDroit);
			Images.add(missile);
			Images.add(sky);
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
		Point player1 = null;
		Point player2 = null;
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Image jetDroit = null, jetGauche = null, missile = null, sky = null;
				Image choix = null;
				try {
					// Placer les avions :
					if (isPlayer(1)) {
						jetGauche = ImageIO.read(new File("jetAGauche.jpg"));
						Images.add(jetGauche);
						// On l'ajoute a une position x/y
						((IMobile) player1).getPosition().getX();
						((IMobile) player1).getPosition().getY();
					}
					if (isPlayer(2)) {
						jetDroit = ImageIO.read(new File("jetADroite.jpg"));
						((IMobile) player2).getPosition().getX();
						((IMobile) player2).getPosition().getY();
						Images.add(jetDroit);
					}
					// Placer le ciel :
					Object cloud = null;
					if (cloud instanceof Sky) {
						sky = ImageIO.read(new File("sky.jpg"));
						Images.add(sky);
						((IMobile) sky).getPosition().getX();
						((IMobile) sky).getPosition().getY();
					}
					// PLacer le ciel
					if (isWeapon()) {
						missile = ImageIO.read(new File("missile.jpg"));
						Images.add(missile);
						((IMobile) missile).getPosition().getX();
						((IMobile) missile).getPosition().getY();
					}

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

			}
		}
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
		return true;

	}

	// gérer les déplacements des avions
	// Composant Vue
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
		final Color darkGray = new Color(64, 64, 64);
		return darkGray;
	}

	public IDogfightModel getDogfightModel() {
		return dogFightModel;

	}

	//
	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		DogfightModel.dogfightModel = dogFightModel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see jpu2016.dogfight.model.IMobile#hit() Afin de savoir si un avion touche
	 * un autre, il faut que le missile lancé le touche :
	 * position(avions2)=missile(avions1) et inversement
	 */
	public boolean hit() {
		Image jetDroit, jetGauche, missile;
		boolean destroy = false;
		try {
			missile = ImageIO.read(new File("missile.jpg"));
			jetDroit = ImageIO.read(new File("jetADroite.jpg"));
			if (jetDroit.equals(missile) && destroy) {
				Images.remove(jetDroit);
				Images.remove(missile);
				System.out.println("U win");
				return destroy;
			}
			jetGauche = ImageIO.read(new File("jetAGauche.jpg"));
			if (jetGauche.equals(missile) && destroy) {
				Images.remove(jetGauche);
				Images.remove(missile);
				System.out.println("U win");
				return destroy;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return destroy;
	}

	// S'il y a une arme, vérifier qu'elle existe
	public boolean isWeapon() {
		Object weapon = null;
		if (weapon instanceof Missile) {
			return true;
		} else {
			return false;
		}
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

package jpu2016.dogfight.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Plane extends Mobile {
	private static int SPEED = 2, WIDTH = 100, HEIGHT = 30;
	private int player;

	public Plane(int player, Direction direction, Position position, String image) {
		super(direction, position, dimension, speed, width, height, image);
		dimension = new Dimension(dimension);
		position = new Position(position);
		this.player = player;
		direction = getDirection();
		Plane.position = position;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

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

	public static int getSPEED() {
		return SPEED;
	}

	public static void setSPEED(int sPEED) {
		SPEED = sPEED;
	}

	public static int getWIDTH() {
		return WIDTH;
	}

	public static void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	public static int getHEIGHT() {
		return HEIGHT;
	}

	public static void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}
}

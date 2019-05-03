package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

import javax.imageio.ImageIO;

public class DogfightModel extends Observable implements IDogfightModel, IMobile {
	private Sky sky;
	private Direction direction;
	private ArrayList<IMobile> mobiles;
	int player;
	Position position;
	static String image = "";
	public static DogfightModel dogfightModel;

	public DogfightModel() {
		Dimension dimension = null;
		sky = new Sky(dimension);
		mobiles = new ArrayList<IMobile>();
	}

	@Override
	public IArea getArea() {
		IArea area = sky;
		return area;
	}

	@Override
	public void buildArea(Dimension dimension) {

		Cloud sky = new Cloud(direction, dimension);
		Plane plane1 = new Plane(player, direction, position, image);
	}

	@Override
	public void addMobile(IMobile Mobile) {
		mobiles.add(Mobile);

	}

	@Override
	public void removeMobile(IMobile Mobile) {
		mobiles.remove(Mobile);

	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return mobiles;
	}

	// jsp
	@Override
	public IMobile getMobileByPlaner(int player) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see jpu2016.dogfight.model.IDogfightModel#setMobilesHavesMoved() modifier
	 * les Mobile qui ont bougé
	 */
	@Override
	public void setMobilesHavesMoved() {
		int width = 0, height = 0;
		ArrayList<Image> Images = new ArrayList<Image>();
		Image jetDroit, jetGauche, missile, sky;
		for(int x=0; x<width; x++) {
			for(int y = 0; y<height; y++) {
				
			}
		}
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

	public Sky getSky() {
		return sky;
	}

	public void setSky(Sky sky) {
		this.sky = sky;
	}

	public void setMobiles(ArrayList<IMobile> mobiles) {
		this.mobiles = mobiles;
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub

	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}
}

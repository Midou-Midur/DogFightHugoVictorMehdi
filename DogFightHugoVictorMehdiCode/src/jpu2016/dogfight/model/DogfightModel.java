package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
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

	//jsp
	@Override
	public IMobile getMobileByPlaner(int player) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see jpu2016.dogfight.model.IDogfightModel#setMobilesHavesMoved()
	 * modifier les Mobile qui ont bougé
	 */
	@Override
	public void setMobilesHavesMoved() {
		
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
}

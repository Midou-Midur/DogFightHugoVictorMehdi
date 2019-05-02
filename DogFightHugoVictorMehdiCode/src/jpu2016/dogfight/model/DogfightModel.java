package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
	private Sky sky;

	public DogfightModel() {
		Dimension dimension = null;
		sky = new Sky(dimension);
	}

	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addMobile(IMobile Mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMobile(IMobile Mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlaner(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub

	}

	public Sky getSky() {
		return sky;
	}

	public void setSky(Sky sky) {
		this.sky = sky;
	}
}

package jpu2016.dogfight.model;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Sky implements IArea {
	private Dimension dimension;

	public Sky(Dimension dimension) {

	}

	@Override
	public Dimension getDimension() {
		return dimension;
	}

	@Override
	public Image getImage() {

		return null;

	}

}

package jpu2016.dogfight.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Sky implements IArea {
	private Dimension dimension;

	public Sky(Dimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public Dimension getDimension() {
		return dimension;
	}

	@Override
	public Image getImage() {

		ArrayList<Image> Images;
		Images = new ArrayList<Image>();
		Image sky = null;
		try {

			sky = ImageIO.read(new File("sky.jpg"));
			Images.add(sky);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sky;
		
	}

}

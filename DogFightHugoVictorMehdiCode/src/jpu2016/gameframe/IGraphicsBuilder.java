package jpu2016.gameframe;

import java.awt.*;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {

    void applyModelToGraphic(Graphics graphics, ImageObserver observer);

    void getGlobalHeight();

    void getGlobalWidth();

}

package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
public class DisplayImage extends Polymorph {
	BufferedImage image;
	DisplayImage(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		try {
			image = ImageIO.read(this.getClass().getResource("yang.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, 100, 100, 100, 100, null);
	}

}

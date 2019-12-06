package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Color;


public class RedMorph extends Polymorph{

	RedMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.fillRect(getx(), gety(), getwidth(), getheight());
	}

}

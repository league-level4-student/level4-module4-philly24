package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingCircle extends Polymorph{
	double angle = 0;
	MovingCircle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.PINK);
		g.fillRect(getx(), gety(), getwidth(), getheight());
	}
	@Override
	public void update() {
		this.x += Math.sin(angle)*10;
		this.y += Math.cos(angle)*10;
    	angle+= .2;
	}
}

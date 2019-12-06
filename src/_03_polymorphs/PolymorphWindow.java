package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
     ArrayList<Polymorph> poly = new ArrayList<Polymorph>();
    //Polymorph bluePoly;
    //Polymorph redPoly;
    //Polymorph movingPoly;
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 poly.add(new MovingMorph(50,50));
   	 poly.add(new RedMorph(50,50));
   	 poly.add(new MovingCircle(50,50));
   	 MovingMouse movingM = new MovingMouse(50,50);
   	 window.addMouseMotionListener(movingM);
   	 poly.add(movingM);
   	 poly.add(new DisplayImage(50,50));
   	 PolyJOP jop = new PolyJOP(50,50);
   	 window.addMouseListener(jop);
   	 poly.add(jop);
   	 /*	movingPoly = new MovingMorph(50,50);
   	 bluePoly = new BluePolymorph(50, 50);
   	 redPoly = new RedMorph(50,50);
	 */
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	/* movingPoly.draw(g);
   	 bluePoly.draw(g);
   	 redPoly.draw(g);
   	 */
   	for (Polymorph polyG: poly) {
   		polyG.draw(g);
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 //bluePoly.update();
   	 //redPoly.update();
   	 //movingPoly.update();
   	 for (Polymorph polys: poly) {
		polys.update();
	}
    }
}

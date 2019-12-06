package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
   protected int x;
   protected int y;
   protected int width;
   protected int height;
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 this.width = 50;
   	 this.height = 50;
    }
    
    public void setx(int x) {
    	this.x = x; 
    }
    public int getx() {
    	return x;
    }
    
    public void sety(int y) {
    	this.y = y;
    }
    public int gety() {
    	return y;
    }
    
    public void setwidth(int width) {
    	this.width = width;
    }
    public int getwidth() {
    	return width;
    }
    
    public void setheight(int height) {
    	this.height = height; 
    }
    public int getheight() {
    	return height;
    }
    
    
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}

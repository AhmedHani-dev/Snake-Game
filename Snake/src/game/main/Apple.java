package game.main;

import java.awt.Color;
import java.awt.Graphics;

public class Apple {
	private int xpos, ypos, size;
	private boolean state;

	public Apple(int xpos, int ypos, int size) {
		this.xpos = xpos;
		this.ypos = ypos;
		this.size = size;
		this.state = true;
	}
	
	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	
	public synchronized void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(xpos * size, ypos * size, size, size);
	}

}

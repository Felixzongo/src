

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;
import java.util.Vector;

public class Obstacles{
	int type;
	
	int x;
	int y;
	
	Image [] images = {
			Toolkit.getDefaultToolkit().getImage("spike A.png"), 
			Toolkit.getDefaultToolkit().getImage("spike B.png"),
			Toolkit.getDefaultToolkit().getImage("spike C.png")
	};
	
	public Obstacles(int x,int y, int type){
//		System.out.println(x + " "+ y);
		
		this.type = type;
		
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g){
	   g.drawImage(images[type], this.x - (int)Camera2D.x, y, null);
	}
	
	
	
}

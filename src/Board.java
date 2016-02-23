import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel{
	
	private Image background;
	
	public Board(){
		initBoard();
	}
	
	private void initBoard(){
		loadImage();
		
		int w = background.getWidth(this);
		int h = background.getHeight(this);
		setPreferredSize(new Dimension(w, h));
	}
	
	private void loadImage(){
		ImageIcon ii = new ImageIcon("background.png");
		background = ii.getImage();
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(background, 0, 0, null);
	}
	
}

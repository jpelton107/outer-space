package star;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.ToolKit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {
	private Image star;
	private Thread animator;
	private int x, y;

	private final int DELAY = 50;

	public Board() {
		setBackground(Color.BLACK);
		setDoubleBuffered(true);
		ImageIcon ii = new ImageIcon(this.getClass().getResource("star.png"));
		star = ii.getImage();

		x = y = 10;
	}

	public void addNotify() {
		super.addNotify();
		animator = new Thread(this);
		animator.start();
	}

	public void paint(Graphics g) {

	}

}

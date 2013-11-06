package skeleton;

import javax.swing.JFrame;

public class Skeleton extends JFrame {

	public Skeleton() {
		add(new Board);
		setTitle("Skeleton");
		setDefaultCloseOperator(EXIT_ON_CLOSE);
		setSize(300, 280);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		new Skeleton();
	}
}

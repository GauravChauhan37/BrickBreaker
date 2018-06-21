package brickbreaker;

import javax.swing.JFrame;

public class brickBreaker {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		gamePlay gp = new gamePlay();
		j.setBounds(10, 10, 700, 600);
		j.setTitle("brickBreaker");
		j.setResizable(false);
		j.add(gp);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

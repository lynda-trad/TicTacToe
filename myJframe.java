package src;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class myJframe
{
	public myJframe()
	{
		JFrame frame = new JFrame("~TicTacToe~");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); /*centers the frame*/
		frame.setSize(450, 450);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
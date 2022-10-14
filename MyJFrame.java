package src;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MyJFrame extends JFrame
{
	public int height = 150;
	public int width = 150;
	public int mouseX = 0;
	public int mouseY = 0;
	
	public void setMouseX(int x)
	{
		this.mouseX = x;
	}
	
	public void setMouseY(int y)
	{
		this.mouseY = y;
	}
	
	public MyJFrame()
	{
		this.setTitle("~TicTacToe~");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(0, 0);
		// this.setLocationRelativeTo(null); /*centers the frame*/
		this.setSize(465, 485);
		this.setResizable(false);
		this.addMouseListener(new MyListener(this));
		
		JPanel jp = new JPanel();
        jp.setLayout(null);
        jp.setBounds(0, 0, 465, 485);
		this.add(jp);
		
		// First line
		
		JPanel rectangle1 = new JPanel();
		int x = 0; int y = 0;
		rectangle1.setBounds(x, y, height + x*2, width + y);
		// rectangle1.setBackground(Color.red);
		jp.add(rectangle1);

		JPanel rectangle2 = new JPanel();
		x = 50; y = 0;
		rectangle2.setBounds(x, y, height + x*2, width + y*2);
		// rectangle2.setBackground(Color.blue);
		jp.add(rectangle2);
		
		JPanel rectangle3 = new JPanel();
		x = 100; y = 0;
		rectangle3.setBounds(x, y, height + x*2, width + y*2);
		// rectangle3.setBackground(Color.green);
		jp.add(rectangle3);
		
		// Second line
		
		JPanel rectangle4 = new JPanel();
		x = 0; y = 50;
		rectangle4.setBounds(x, y, height + x*2, width + y*2);
		// rectangle4.setBackground(Color.blue);
		jp.add(rectangle4);
		

		JPanel rectangle5 = new JPanel();
		x = 50; y = 50;
		rectangle5.setBounds(x, y, height + x*2, width + y*2);
		// rectangle5.setBackground(Color.green);
		jp.add(rectangle5);
		

		JPanel rectangle6 = new JPanel();
		x = 100; y = 50;
		rectangle6.setBounds(x, y, height + x*2, width + y*2);
		// rectangle6.setBackground(Color.red);
		jp.add(rectangle6);
		
		// Third line

		JPanel rectangle7 = new JPanel();
		x = 0; y = 100;
		rectangle7.setBounds(x, y, height + x*2, width + y*2);
		// rectangle7.setBackground(Color.green);
		jp.add(rectangle7);

		JPanel rectangle8 = new JPanel();
		x = 50; y = 100;
		rectangle8.setBounds(x, y, height + x*2, width + y*2);
		// rectangle8.setBackground(Color.red);
		jp.add(rectangle8);

		JPanel rectangle9 = new JPanel();
		x = 100; y = 100;
		rectangle9.setBounds(x, y, height + x*2, width + y*2);
		// rectangle9.setBackground(Color.blue);
		jp.add(rectangle9);

		this.setVisible(true);
	}
}
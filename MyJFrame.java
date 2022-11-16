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
	public int height = 300;
	public int width = 300;
	public int mouseX = 0;
	public int mouseY = 0;
	private Game game;
	private JPanel[] panels;
	private JPanel panel;
	
	public void setGame(Game g)
	{
		this.game = g;
	}
	
	public void setMouseClick(int x, int y)
	{
		this.mouseX = x;
		this.mouseY = y;
		System.out.println(x + "," + y);
		
		// 1st line
		if(x > 0 && x < height && y > 0 && y < width + 50*2)
		{ // rectangle1 -> [0][0]
			this.game.editBoard(0, 0, this.game.getCurrentPlayer());
		}
		if(x > 50 && x < height + 50*2 && y > 0 && y < width + 50*2)
		{ // rectangle2 -> [0][1]
			this.game.editBoard(0, 1, this.game.getCurrentPlayer());
		}
		if(x > 100 && x < height + 100*2 && y > 0 && y < width + 50*2)
		{ // rectangle3 -> [0][2]
			this.game.editBoard(0, 2, this.game.getCurrentPlayer());
		}
		
		// 2nd line
		if(x > 0 && x < 50 && y > 50 && y < 100)
		{ // rectangle4 -> [1][0]
			this.game.editBoard(1, 0, this.game.getCurrentPlayer());
		}
		if(x > 50 && x < 100 && y > 50 && y < 100)
		{ // rectangle5 -> [1][1]
			this.game.editBoard(1, 1, this.game.getCurrentPlayer());
		}
		if(x > 100 && x < 150 && y > 50 && y < 100)
		{ // rectangle6 -> [1][2]
			this.game.editBoard(1, 2, this.game.getCurrentPlayer());
		}
		
		// 3rd line
		if(x > 0 && x < 50 && y > 100 && y < 150)
		{ // rectangle7 -> [2][0]
			this.game.editBoard(2, 0, this.game.getCurrentPlayer());
		}
		if(x > 50 && x < 100 && y > 100 && y < 150)
		{ // rectangle8 -> [2][1]
			this.game.editBoard(2, 1, this.game.getCurrentPlayer());
		}
		if(x > 100 && x < 150 && y > 100 && y < 150)
		{ // rectangle9 -> [2][2]
			this.game.editBoard(2, 2, this.game.getCurrentPlayer());
		}

		this.mouseX = 0;
		this.mouseY = 0;
		if(this.game.getCurrentPlayer() == 1)
		{
			this.game.setCurrentPlayer(2);
		}
		else
		{
			game.setCurrentPlayer(1);
		}
	}
	
	public void updateColors()
	{
		int[][] Board = this.game.getBoard();
		
		JPanel rectangle1 = this.panels[0];
		JPanel rectangle2 = this.panels[1];
		JPanel rectangle3 = this.panels[2];
		JPanel rectangle4 = this.panels[3];
		JPanel rectangle5 = this.panels[4];
		JPanel rectangle6 = this.panels[5];
		JPanel rectangle7 = this.panels[6];
		JPanel rectangle8 = this.panels[7];
		JPanel rectangle9 = this.panels[8];
		
		if(Board[0][0] == 1)
		{
			rectangle1.setBackground(Color.red);
		}
		else if(Board[0][0] == 2)
		{
			rectangle1.setBackground(Color.blue);
		}
		
		if(Board[0][1] == 1)
		{
			rectangle2.setBackground(Color.red);
		}
		else if(Board[0][1] == 2)
		{
			rectangle2.setBackground(Color.blue);
		}
		
		if(Board[0][2] == 1)
		{
			rectangle3.setBackground(Color.red);
		}
		else if(Board[0][2] == 2)
		{
			rectangle3.setBackground(Color.blue);
		}
		
		if(Board[1][0] == 1)
		{
			rectangle4.setBackground(Color.red);
		}
		else if(Board[1][0] == 2)
		{
			rectangle4.setBackground(Color.blue);
		}
		
		if(Board[1][1] == 1)
		{
			rectangle5.setBackground(Color.red);
		}
		else if(Board[1][1] == 2)
		{
			rectangle5.setBackground(Color.blue);
		}
		
		if(Board[1][2] == 1)
		{
			rectangle6.setBackground(Color.red);
		}
		else if(Board[1][2] == 2)
		{
			rectangle6.setBackground(Color.blue);
		}

		if(Board[2][0] == 1)
		{
			rectangle7.setBackground(Color.red);
		}
		else if(Board[2][0] == 2)
		{
			rectangle7.setBackground(Color.blue);
		}
		
		if(Board[2][1] == 1)
		{
			rectangle8.setBackground(Color.red);
		}
		else if(Board[2][1] == 2)
		{
			rectangle8.setBackground(Color.blue);
		}
		
		if(Board[2][2] == 1)
		{
			rectangle9.setBackground(Color.red);
		}
		else if(Board[2][2] == 2)
		{
			rectangle9.setBackground(Color.blue);
		}
	}
	
	public MyJFrame(Game g)
	{
		this.game = g;
		this.setTitle("~TicTacToe~");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(0, 0);
		// this.setLocationRelativeTo(null); /*centers the frame*/
		this.setSize(width,height+22);
		// this.setSize(465, 485);
		this.setResizable(false);
		this.addMouseListener(new MyListener(this));
		int [][] Board = this.game.getBoard();
		
		JPanel jp = new JPanel()
		{
			/*
		    protected void paintComponent(Graphics g) 
		    {
		         super.paintComponent(g);  
		         g.drawRect(0,0, height, width);
		         if(Board[0][0] == 1)
		         {
		        	 g.setColor(Color.RED);
		         }
		         else if(Board[0][0] == 2)
		         {
		        	 g.setColor(Color.BLUE);
		         }
		         else {
		        	 g.setColor(Color.WHITE);
		         }
		         g.fillRect(0,0, height, width);
		         
		         g.drawRect(50,0, height, width);
		         if(Board[0][1] == 1)
		         {
		        	 g.setColor(Color.RED);
		         }
		         else if(Board[0][1] == 2)
		         {
		        	 g.setColor(Color.BLUE);
		         }
		         else {
		        	 g.setColor(Color.WHITE);
		         }
		         g.fillRect(50,0, height, width);

		         g.drawRect(100,0, height, width);
		         if(Board[0][2] == 1)
		         {
		        	 g.setColor(Color.RED);
		         }
		         else if(Board[0][2] == 2)
		         {
		        	 g.setColor(Color.BLUE);
		         }
		         else {
		        	 g.setColor(Color.WHITE);
		         }
		         g.fillRect(100,0, height, width);
		    }
			*/
		};
		jp.setLayout(null);
        jp.setBounds(0, 0, height, width);
        // jp.setBounds(0, 0, 465, 485);
		this.add(jp);
		
		// First line

		JPanel rectangle1 = new JPanel();
		int x = 0; int y = 0;

		rectangle1.setBounds(x, y, height + x*2, width + y);
		jp.add(rectangle1);

		JPanel rectangle2 = new JPanel();
		x = 50; y = 0;
		rectangle2.setBounds(x, y, height + x*2, width + y*2);
		jp.add(rectangle2);
		
		JPanel rectangle3 = new JPanel();
		x = 100; y = 0;
		rectangle3.setBounds(x, y, height + x*2, width + y*2);
		jp.add(rectangle3);
		
		// Second line
		
		JPanel rectangle4 = new JPanel();
		x = 0; y = 50;
		rectangle4.setBounds(x, y, height + x*2, width + y*2);
		jp.add(rectangle4);
		

		JPanel rectangle5 = new JPanel();
		x = 50; y = 50;
		rectangle5.setBounds(x, y, height + x*2, width + y*2);
		jp.add(rectangle5);
		

		JPanel rectangle6 = new JPanel();
		x = 100; y = 50;
		rectangle6.setBounds(x, y, height + x*2, width + y*2);
		jp.add(rectangle6);
		
		// Third line

		JPanel rectangle7 = new JPanel();
		x = 0; y = 100;
		rectangle7.setBounds(x, y, height + x*2, width + y*2);
		jp.add(rectangle7);

		JPanel rectangle8 = new JPanel();
		x = 50; y = 100;
		rectangle8.setBounds(x, y, height + x*2, width + y*2);
		jp.add(rectangle8);

		JPanel rectangle9 = new JPanel();
		x = 100; y = 100;
		rectangle9.setBounds(x, y, height + x*2, width + y*2);
		jp.add(rectangle9);

		this.panels = new JPanel[] {rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6, rectangle7, rectangle8, rectangle9};
		
		this.setVisible(true);
	}
}
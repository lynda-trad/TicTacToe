package src;

import javax.swing.JFrame;

public class Game
{
	private boolean PlayerOne; /*Red*/
	private boolean PlayerTwo; /*Blue*/
	private int[] Board;
	private myJframe frame;
	
	public Game()
	{
		PlayerOne = true;
		PlayerTwo = false;
		Board = new int[9];
		frame = new myJframe();
	}
	
	public static void main(String []args)
	{
		System.out.println("This is a TicTacToe game!");
	}
}
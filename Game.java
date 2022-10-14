package src;

public class Game
{
	private boolean PlayerOne; /*Red == PlayerOne, Blue == PLayerTwo*/
	private int[] Board;
	private MyJFrame frame;
	private int winner = 0;
	
	public Game()
	{
		PlayerOne = true;
		Board = new int[9];
		frame = new MyJFrame();
	}
	
	public static void main(String []args)
	{
		Game game = new Game();
		while(game.winner == 0)
		{
			if(game.PlayerOne)
			{
				
			}
			else
			{
				
			}
		}
		System.out.println("This is a TicTacToe game!");
	}
}
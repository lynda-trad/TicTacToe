package src;

public class Game
{
	private boolean PlayerOne; /*Red == PlayerOne, Blue == PLayerTwo*/
	private int[][] Board;
	private MyJFrame frame;
	private int winner = 0;
	
	public Game()
	{
		PlayerOne = true;
		Board = new int[3][3];
		frame = new MyJFrame();
	}
	
	private static void checkWinner(Game g)
	{
		// Diagonal
		if(g.Board[0][0] == g.Board[1][1] && g.Board[1][1] == g.Board[2][2] && g.Board[0][0] != 0)
		{
			g.winner = g.Board[0][0];
		}
		else if(g.Board[0][2] == g.Board[1][1] && g.Board[1][1] == g.Board[2][0] && g.Board[0][2] != 0)
		{
			g.winner = g.Board[0][2];
		}
		// Vertical
		else if(g.Board[0][0] == g.Board[1][0] && g.Board[1][0] == g.Board[2][0] && g.Board[0][0] != 0)
		{
			g.winner = g.Board[0][0];
		}
		else if(g.Board[0][1] == g.Board[1][1] && g.Board[1][1] == g.Board[2][1] && g.Board[0][1] != 0)
		{
			g.winner = g.Board[0][1];
		}
		else if(g.Board[0][2] == g.Board[1][2] && g.Board[1][2] == g.Board[2][2] && g.Board[0][2] != 0)
		{
			g.winner = g.Board[0][2];
		}
		// Horizontal
		else if(g.Board[0][0] == g.Board[0][1] && g.Board[0][1] == g.Board[0][2] && g.Board[0][0] != 0)
		{
			g.winner = g.Board[0][0];
		}
		else if(g.Board[1][0] == g.Board[1][1] && g.Board[1][1] == g.Board[1][2] && g.Board[1][0] != 0)
		{
			g.winner = g.Board[1][0];
		}
		else if(g.Board[2][0] == g.Board[2][1] && g.Board[2][1] == g.Board[2][2] && g.Board[2][0] != 0)
		{
			g.winner = g.Board[2][0];
		}
	}
	
	public static void main(String []args)
	{
		Game game = new Game();
		checkWinner(game);
		while(game.winner == 0)
		{
			if(game.PlayerOne)
			{
				
			}
			else
			{
				
			}
		}
		System.out.println("Player" + game.winner + "won !");
	}
}
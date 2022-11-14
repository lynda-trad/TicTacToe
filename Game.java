package src;

public class Game
{
	private int currentPlayer; /*Red == Player One, Blue == Player Two*/
	private int[][] Board;
	private MyJFrame frame;
	private int winner = 0;
	
	public Game()
	{
		currentPlayer = 1;
		Board = new int[3][3];
		frame = new MyJFrame();
	}

	private void setCurrentPlayer(int p)
	{
		this.currentPlayer = p;
	}
	
	private void setWinner(int w)
	{
		this.winner = w;
	}
	
	private static void checkWinner(Game g)
	{
		// Diagonal
		if(g.Board[0][0] == g.Board[1][1] && g.Board[1][1] == g.Board[2][2] && g.Board[0][0] != 0)
		{
			g.setWinner(g.Board[0][0]);
		}
		else if(g.Board[0][2] == g.Board[1][1] && g.Board[1][1] == g.Board[2][0] && g.Board[0][2] != 0)
		{
			g.setWinner(g.Board[0][2]);
		}
		// Vertical
		else if(g.Board[0][0] == g.Board[1][0] && g.Board[1][0] == g.Board[2][0] && g.Board[0][0] != 0)
		{
			g.setWinner(g.Board[0][0]);
		}
		else if(g.Board[0][1] == g.Board[1][1] && g.Board[1][1] == g.Board[2][1] && g.Board[0][1] != 0)
		{
			g.setWinner(g.Board[0][1]);
		}
		else if(g.Board[0][2] == g.Board[1][2] && g.Board[1][2] == g.Board[2][2] && g.Board[0][2] != 0)
		{
			g.setWinner(g.Board[0][2]);
		}
		// Horizontal
		else if(g.Board[0][0] == g.Board[0][1] && g.Board[0][1] == g.Board[0][2] && g.Board[0][0] != 0)
		{
			g.setWinner(g.Board[0][0]);
		}
		else if(g.Board[1][0] == g.Board[1][1] && g.Board[1][1] == g.Board[1][2] && g.Board[1][0] != 0)
		{
			g.setWinner(g.Board[1][0]);
		}
		else if(g.Board[2][0] == g.Board[2][1] && g.Board[2][1] == g.Board[2][2] && g.Board[2][0] != 0)
		{
			g.setWinner(g.Board[2][0]);
		}
	}
	
	public static void main(String []args)
	{
		Game game = new Game();
		checkWinner(game);
		while(game.winner == 0)
		{
			if(game.currentPlayer == 1)
			{
				// Player One plays, color changed to red
				game.setCurrentPlayer(2);
			}
			else
			{
				// Player Two plays, color changed to blue
				game.setCurrentPlayer(1);
			}
		}
		System.out.println("Player" + game.winner + "won !");
	}
}
package src;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyListener extends MouseAdapter
{
	private MyJFrame frame;
	
	public MyListener(MyJFrame f)
	{
		this.frame = f;
	}
	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		super.mouseClicked(e);
		frame.setMouseClick(e.getX(), e.getY());
	}
}
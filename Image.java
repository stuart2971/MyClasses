import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

class Image extends JPanel
{
	BufferedImage image = null;
	int width, height;
	
	Image(String file, int _width, int _height)
	{
		width = _width;
		height = _height;
		super.setSize(width, height);
		try
		{
			image = ImageIO.read(new File(file));
		}
		catch(IOException e)
		{
			System.out.println("Failed to load Image");
		}
	}
	
	public void setImage(String file)
	{
		try
		{
			image = ImageIO.read(new File(file));
		}
		catch(IOException e)
		{
			System.out.println("Failed to load Image");
		}
		super.repaint();
	}
	
	public void setImage(String file, int _width, int _height)
	{
		width = _width;
		height = _height;
		super.setSize(width, height);
		setImage(file);
	}
	
	@Override
	public void setSize(int _width, int _height)
	{
		width = _width;
		height = _height;
		super.setSize(width, height);
	}
	
	@Override
	public Dimension getPreferredSize()
	{
  	return new Dimension(width, height);
  }
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(image != null)
		{
			g.drawImage(image, 0, 0, width, height, null);
		}
	}
}
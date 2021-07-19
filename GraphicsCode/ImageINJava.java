
import java.awt.*;
import java.awt.event.*;
class Code{
	public static void main(String[] args) {
		
		Root myFrame = new Root();
		myFrame.setSize(600,350);
		myFrame.setVisible(true);

	}
}

class Root extends Frame{

	 static Image img;
	public Root()
	{
		this.addWindowListener(new WindowAdapter(){

			public void windowClosing(WindowEvent e)
			{
				System.out.println("Bye bye...");
				System.exit(0);

			}
		});

		img = Toolkit.getDefaultToolkit().getImage("/home/you/Pictures/a.jpg");
	}

	public void paint(Graphics g)
	{
	 
	 	g.drawImage(img,0,0,null);
	}
}
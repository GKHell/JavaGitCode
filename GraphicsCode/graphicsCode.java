
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

	public Root()
	{
		this.addWindowListener(new WindowAdapter(){

			public void windowClosing(WindowEvent e)
			{
				System.out.println("Bye bye...");
				System.exit(0);

			}
		});
	}

	public void paint(Graphics g)
	{
		// x => left ,y = top

		this.setBackground(new Color(50,50,50)); // new Color(r,g,b) : value 0 to 255
		
		g.setColor(Color.blue);//fore ground
		
		g.drawLine(100,100,600,100);

		g.setColor(Color.white);
		g.drawLine(100,105,600,105);
		g.fillRect(40,50,100,200);

		g.setColor(new Color(110,10,40));
		g.fillRect(30,40,100,200);

		g.setColor(Color.red);
		g.fillOval(150,50,40,50);

		g.setColor(Color.white);
			//     x , y , w, h, start,end
		g.drawArc(200,300,100,300,45,180);
		g.fillArc(220,310,100,300,45,180);

		g.setFont(new Font("serif",Font.BOLD+Font.ITALIC,30));
		g.drawString("Gk programmings...",250,100);

	}
}
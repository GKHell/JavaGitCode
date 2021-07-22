
import java.awt.*; //container
import javax.swing.*; //Jframe

class Code{
	public static void main(String[] args) {
	
		Root window = new Root();

		window.setSize(500,350);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
}
class Root extends JFrame{


		public Root()
		{
			Container c = getContentPane();
			BorderLayout myBorder = new BorderLayout();

			c.setLayout(myBorder);

			JButton b1 = new JButton("Button 1");
			JButton b2 = new JButton("Button 2");
			JButton b3 = new JButton("Button 3");
			JButton b4 = new JButton("Button 4");
			JButton b5 = new JButton("Button 5");

			c.add(b1,BorderLayout.NORTH);
			c.add(b2,BorderLayout.SOUTH);
			c.add(b3,BorderLayout.EAST);
			c.add(b4,BorderLayout.WEST);
			c.add(b5,BorderLayout.CENTER);

			// b1.setForeground(Color.red);
			b1.setBackground(Color.red);
			b2.setBackground(new Color(200,200,40));


			
		}
}

/**
 *   awt  : swing
 *  
 * 
 * */
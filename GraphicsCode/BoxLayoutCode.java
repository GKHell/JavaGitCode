
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
			BoxLayout myBox = new BoxLayout(c,BoxLayout.X_AXIS);

			c.setLayout(myBox);

			JButton b1 = new JButton("HOME");
			JButton b2 = new JButton("EDIT");
			JButton b3 = new JButton("FORMAT");
			JButton b4 = new JButton("VIEW");
			JButton b5 = new JButton("RUN");


			c.add(b1);
			c.add(b2);
			c.add(b3);
			c.add(b4);
			c.add(b5);

			b2.setForeground(Color.red);

			
		}
}

/**
 *   awt  : swing
 *  
 * 
 * */
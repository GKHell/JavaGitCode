
import java.awt.*; //container
import java.awt.event.*; //container

import javax.swing.*; //Jframe
// import javax.swing.events.*;


class Code{
	public static void main(String[] args) {
	
		Root window = new Root();

		window.setTitle("LayoutCode");
		window.setSize(500,350);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
class Root extends JFrame implements ActionListener{

	Container c;
	CardLayout card;
	JButton b1,b2,b3,b4,b5;

		public Root() // constructor
		{
			c = getContentPane();

			card = new CardLayout();
			c.setLayout(card);

			b1 = new JButton("Button 1");
			b2 = new JButton("Button 2");
			b3 = new JButton("Button 3");
			b4 = new JButton("Button 4");
			b5 = new JButton("Button 5");

			c.add(b1);
			c.add(b2);
			c.add(b3);
			c.add(b4);
			c.add(b5);

			b1.addActionListener(this); //event listener
			b2.addActionListener(this); //event listener
			b3.addActionListener(this); //event listener
			b4.addActionListener(this); //event listener
			b5.addActionListener(this); //event listener


		}
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Hello World...");
			card.next(c);

		}
}

/**
 *   awt  : swing
 *  
 * 
 * */
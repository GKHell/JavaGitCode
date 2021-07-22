
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class Code{
	public static void main(String[] args) {
		
		Root r = new Root();
		r.setSize(600,300);
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class Root extends JFrame implements ActionListener{

	JPanel mainPanel,formPanel;
	JLabel lblName,lblRollNo;
	JTextField txtName,txtRollNo;
	JButton btnSave;
	public Root() //constructor....
	{
		mainPanel =  new JPanel();
		BorderLayout border = new BorderLayout();
		mainPanel.setLayout(border); //setting border for MainPanel 

		// mainPanel.setBackground(Color.red);
		this.add(mainPanel);

		formPanel = new JPanel();
		mainPanel.add(formPanel);

		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();

		formPanel.setLayout(grid);

		gbc.gridx = 0;
		gbc.gridy = 0;
		lblName = new JLabel("Name : ");
		formPanel.add(lblName,gbc);

			gbc.gridx = 1;
			gbc.gridy = 0;
			txtName = new JTextField(10);
			formPanel.add(txtName,gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		lblRollNo = new JLabel("RollNo : ");
		formPanel.add(lblRollNo,gbc);

			gbc.gridx = 1;
			gbc.gridy = 1;
			txtRollNo = new JTextField(10);
			formPanel.add(txtRollNo,gbc);

               // str  => int
			//    "56" => 56
			// "ds562" => Error

			gbc.gridx = 0;
			gbc.gridy = 10;
			gbc.gridwidth = 2;
			btnSave = new JButton("Save");
			formPanel.add(btnSave,gbc);
			btnSave.addActionListener(this);		 
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnSave)
		 {
		 	try{
		 		Integer.parseInt(txtRollNo.getText());
		 		txtRollNo.setBackground(Color.green);
		 		System.out.println("Valid....");

		 		System.out.println(txtName.getText()+" Welcome..");
		 	}
		 	catch(Exception ex)
		 	{
		 		txtRollNo.setBackground(Color.red);
		 		System.out.println("Enter number only.....");
		 	}
		 }
	}
}
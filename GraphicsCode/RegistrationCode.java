
import java.awt.*;
import java.awt.event.*; 

import javax.swing.*; // pre 'J'
class RegistrationCode{
	public static void main(String[] args) {
		
		Root r = new Root();
		r.setSize(600,300);
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class Root extends JFrame implements ActionListener,ItemListener{

	JPanel mainPanel,formPanel;
	JLabel lblName,lblRollNo,lblGender,lblHobbies,lblLanguage,lblMovies,lblHumanLaguage; // label
	JTextField txtName,txtRollNo;
	JRadioButton rbMale,rbFemale,rbOther; //radio Button
	JCheckBox cbProgramming,cbMusic,cbPaiting;
	Choice cLanguage;
	JList lstMovies;
	JScrollPane sb;
	JComboBox cbLang;
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
		gbc.anchor = GridBagConstraints.EAST;
		lblName = new JLabel("Name : ");
		formPanel.add(lblName,gbc);

			gbc.gridx = 1;
			gbc.gridy = 0;
			gbc.anchor = GridBagConstraints.WEST;
			txtName = new JTextField(10);
			formPanel.add(txtName,gbc);

		gbc.anchor = GridBagConstraints.EAST;
		gbc.gridx = 0;
		gbc.gridy = 1;
		lblRollNo = new JLabel("RollNo : ");
		formPanel.add(lblRollNo,gbc);

			gbc.gridx = 1;
			gbc.gridy = 1;
			gbc.anchor = GridBagConstraints.WEST;
			txtRollNo = new JTextField(10);
			formPanel.add(txtRollNo,gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.EAST;
		lblGender = new JLabel("Gender : ");
		formPanel.add(lblGender,gbc);

				gbc.gridx = 1;
				gbc.gridy = 2; 
				gbc.anchor = GridBagConstraints.WEST;
				JPanel p = new JPanel(new FlowLayout());
				formPanel.add(p,gbc);

				rbMale = new JRadioButton("Male");
				rbFemale = new JRadioButton("Female");
				rbOther = new JRadioButton("Other");
				p.add(rbMale);
				p.add(rbFemale);
				p.add(rbOther);

				ButtonGroup grp = new ButtonGroup();
				grp.add(rbMale);
				grp.add(rbFemale);
				grp.add(rbOther);

				rbMale.addItemListener(this);
				rbFemale.addItemListener(this);
				rbOther.addItemListener(this);

			
			gbc.gridx = 0;
			gbc.gridy = 3;
			gbc.anchor = GridBagConstraints.EAST;
			lblHobbies = new JLabel("Hobbies : ");
			formPanel.add(lblHobbies,gbc);

					gbc.gridx = 1;
					gbc.gridy = 3; 
					gbc.anchor = GridBagConstraints.WEST;
					JPanel q = new JPanel(new FlowLayout());
					formPanel.add(q,gbc);

					cbProgramming = new JCheckBox("Programming");
					cbMusic = new JCheckBox("Music");
					cbPaiting = new JCheckBox("Painting ft manju");

					q.add(cbProgramming);
					q.add(cbMusic);
					q.add(cbPaiting);

					cbProgramming.addItemListener(this);
					cbMusic.addItemListener(this);
					cbPaiting.addItemListener(this);



			gbc.gridx = 0;
			gbc.gridy = 4;
			gbc.anchor = GridBagConstraints.EAST;
			lblLanguage = new JLabel("Language : ");
			formPanel.add(lblLanguage,gbc);
					
					gbc.gridx = 1;
					gbc.gridy = 4; 
					gbc.anchor = GridBagConstraints.WEST;
					cLanguage = new Choice();
					cLanguage.add("Python");
					cLanguage.add("Java");
					cLanguage.add("Php");
					cLanguage.add("HTML");
					formPanel.add(cLanguage,gbc);



			gbc.gridx = 0;
			gbc.gridy = 5;
			gbc.anchor = GridBagConstraints.EAST;
			lblMovies = new JLabel("Movies : ");
			formPanel.add(lblMovies,gbc);

				gbc.gridx = 1;
				gbc.gridy = 5;
				gbc.anchor = GridBagConstraints.WEST;
				String list[] = {"IronMan","Loki","ZindaHoonMain","TeraBadla"};
				lstMovies = new JList<String>(list);
				lstMovies.setVisibleRowCount(2);
				sb = new JScrollPane(lstMovies);
				formPanel.add(sb,gbc);
				//list -> lstMovies -> sb -> formPanel


			gbc.gridx = 0;
			gbc.gridy = 6;
			gbc.anchor = GridBagConstraints.EAST;
			lblHumanLaguage = new JLabel("Language : ");
			formPanel.add(lblHumanLaguage,gbc);

				gbc.gridx = 1;
				gbc.gridy = 6;
				gbc.anchor = GridBagConstraints.WEST;
				String data[] = {"English","Sankrit","Guj"};
				cbLang = new JComboBox<String>(data);
				formPanel.add(cbLang,gbc);


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
	public void actionPerformed(ActionEvent e) //click event
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
	int i=0;
	public void itemStateChanged(ItemEvent ie) //select event
	{
		// System.out.println("Hello ---"+(i++));
		if(ie.getSource()==rbMale)
		{
			if(ie.getStateChange()==1)
				System.out.println(rbMale.getText()+ " selected...");
		}
		if(ie.getSource()==rbFemale)
		{
			if(ie.getStateChange()==1)
				System.out.println("\t\t"+rbFemale.getText()+ " selected...");
		}
		if(ie.getSource()==rbOther)
		{
			if(ie.getStateChange()==1)
				System.out.println("\t\t\t"+rbOther.getText()+ " selected...");
		}
		if(ie.getSource()==cbProgramming)
		{
			if(ie.getStateChange()==1)
			 	System.out.println("Programming is -------------");
			else
			 	System.out.println("\t Programming was -------------");

		}
		if(ie.getSource()==cbMusic)
		{
			if(ie.getStateChange()==1)
				System.out.println("Music is --------------------");
			else
			 	System.out.println("\t Music was -------------");

		}
		if (ie.getSource()==cbPaiting)
		 {
			if(ie.getStateChange()==1)
				System.out.println("Paint is --------------------");
			else
				System.out.println("\t Paint was --------------------");
		}
	}
}
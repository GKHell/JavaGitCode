
import java.awt.*;
import java.awt.event.*; 

import javax.swing.*; // pre 'J'
import java.util.*;
import java.io.*;
class RegistrationCode{
	public static void main(String[] args) throws Exception {
		
		Root r = new Root();
		r.setSize(600,300);
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class Root extends JFrame implements ActionListener,ItemListener{

	private JPanel mainPanel,formPanel,menuPanel;
	private JLabel lblName,lblRollNo,lblGender,lblHobbies,lblLanguage,lblMovies,lblHumanLaguage; // label
	private JTextField txtName,txtRollNo;
	private JRadioButton rbMale,rbFemale,rbOther; //radio Button
	private JCheckBox cbProgramming,cbMusic,cbPaiting;
	private Choice cLanguage;
	private JList lstMovies;
	private JScrollPane sb;
	private JComboBox cbLang;
	private JMenuBar mb;
	private JMenu mnFile,mnEdit;
	private JMenuItem miFileOpen,miFileSave,miFileClose,miCopy,miPaste;
	private JButton btnSave; 

	//////////
	String name,gender,programingLangauge,humanLanguage,movie;
	int rollNo;
	ArrayList <String>hobbies;
	public Root() //constructor....
	{
		hobbies = new ArrayList<String>();
		mainPanel =  new JPanel();
		BorderLayout border = new BorderLayout();
		mainPanel.setLayout(border); //setting border for MainPanel 

		// mainPanel.setBackground(Color.red);
		this.add(mainPanel);

		mb = new JMenuBar();
		mainPanel.add(mb,BorderLayout.NORTH);
	
			// menuitem -> menu -> menubar
			mnFile = new JMenu("File");
			miFileOpen = new JMenuItem("Open File");
			mnFile.add(miFileOpen); //add to menu

			miFileSave = new JMenuItem("Save");
			mnFile.add(miFileSave); //add to menu

			miFileClose = new JMenuItem("Close file");
			mnFile.add(miFileClose);
			mb.add(mnFile); // add to menu bar
		
				mnEdit = new JMenu("Edit kro");
				miCopy = new JMenuItem("Copy");
				mnEdit.add(miCopy);

				miPaste = new JMenuItem("Paste");
				mnEdit.add(miPaste);

				mb.add(mnEdit);

		formPanel = new JPanel();
		mainPanel.add(formPanel,BorderLayout.CENTER);

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
			lblLanguage = new JLabel("Pro Language : ");
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
			lblHumanLaguage = new JLabel("Hu Language : ");
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
		 		// System.out.println("Valid....");
		 		// System.out.println(txtName.getText()+" Welcome..");
		 		////

		 				 name = txtName.getText();
		 				 rollNo = Integer.parseInt(txtRollNo.getText());
		 				 programingLangauge = cLanguage.getSelectedItem(); // drop down
		 				 movie = lstMovies.getSelectedValue().toString(); // scroll
		 				 humanLanguage = cbLang.getSelectedItem().toString(); // drop down


			 				System.out.println("         Name : "+name);
			 				System.out.println("       Rollno : "+rollNo);
			 				System.out.println("       Gender : "+gender);
			 				System.out.println("      hobbies : "+hobbies);
			 				System.out.println("  Programming : "+programingLangauge);
			 				System.out.println("       Movies : "+movie);
			 				System.out.println("humanLanguage : "+humanLanguage);


		 				try
		 				{
		 					File f = new File("UserData");
		 					f.mkdir();
		 					System.out.println("done");
		 				}
		 				catch(Exception ex)
		 				{
		 					System.out.println("Eroor.");
		 				}

		 				FileOutputStream file;
		 				try{

		 					file = new FileOutputStream("./UserData/"+rollNo+"_"+name+".txt");
		 					PrintStream ps = new PrintStream(file);

			 				ps.println("         Name : "+name);
			 				ps.println("       Rollno : "+rollNo);
			 				ps.println("       Gender : "+gender);
			 				ps.println("      hobbies : "+hobbies);
			 				ps.println("  Programming : "+programingLangauge);
			 				ps.println("       Movies : "+movie);
			 				ps.println("humanLanguage : "+humanLanguage);


		 				}	
		 				catch(Exception ex)
		 				{
		 					System.out.println("Error...");
		 				}


		 		///
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
			{
				// System.out.println(rbMale.getText()+ " selected...");
				gender = rbMale.getText();
			}
		}
		if(ie.getSource()==rbFemale)
		{
			if(ie.getStateChange()==1)
			{
				// System.out.println("\t\t"+rbFemale.getText()+ " selected...");
				gender = rbFemale.getText();
			}
		}
		if(ie.getSource()==rbOther)
		{
			if(ie.getStateChange()==1)
			{
				// System.out.println("\t\t\t"+rbOther.getText()+ " selected...");
				gender = rbOther.getText();
			}
		}
		//---------------------
		if(ie.getSource()==cbProgramming)
		{
			if(ie.getStateChange()==1)
			{
			 	System.out.println("Programming is -------------");
			 	hobbies.add(cbProgramming.getText());
			}
			else
			{
			 	System.out.println("\t Programming was -------------");
			 	hobbies.remove(cbProgramming.getText());

			}

		}
		if(ie.getSource()==cbMusic)
		{
			if(ie.getStateChange()==1)
			{
				System.out.println("Music is --------------------");
			 	hobbies.add(cbMusic.getText());

			}
			else
			{
			 	System.out.println("\t Music was -------------");
			 	hobbies.remove(cbMusic.getText());

			}

		}
		if (ie.getSource()==cbPaiting)
		 {
			if(ie.getStateChange()==1)
			{
				System.out.println("Paint is --------------------");
			 	 hobbies.add(cbPaiting.getText());

			}
			else
			{
				System.out.println("\t Paint was --------------------");
			 	hobbies.remove(cbPaiting.getText());
			}
		}
	}
}
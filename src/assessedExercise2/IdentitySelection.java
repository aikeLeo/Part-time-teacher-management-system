package assessedExercise2;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class IdentitySelection extends JFrame implements  ActionListener{
	//Define components
	JFrame frame=new JFrame();
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	
	//Constructor
	public IdentitySelection(){
		//Create panel
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		//Create label
		jlb1=new JLabel("Please Log In According to Your Identity");
		
		//Create button
		jb1=new JButton("Staff");
		jb2=new JButton("Teacher");
				
		//Set up the layout
		frame.setLayout(new GridLayout(3, 1));
		
		jp1.add(jlb1);
			
		jp3.add(jb1);
		jp3.add(jb2);
		
		frame.add(jp2);
		frame.add(jp1);
		//this.add(jp2);
		frame.add(jp3);
		
		//Setup form
		frame.setTitle("User Selection Interface");//Form label
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//this.setResizable(false);
				
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			   frame.setVisible(false);
//				new StaffInterface();
				StaffInterface frame = new StaffInterface();
				frame.setVisible(true);
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			   frame.setVisible(false);
//				new TeacherInterface();
				TeacherInterface frame = new TeacherInterface();
				frame.setVisible(true);
			}
		});
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


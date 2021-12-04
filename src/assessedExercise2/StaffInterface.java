package assessedExercise2;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Hashtable;


public class StaffInterface extends JFrame {
	
	SystemFunction function = new SystemFunction();
	
	Teacher teacher = new Teacher();
    ArrayList<Teacher> arry=new ArrayList<Teacher>();

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffInterface frame = new StaffInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StaffInterface() {
		
		setTitle("Staff Manager Interface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1031, 672);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Teacher ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();        // Teacher ID
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Teacher Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();      //Teacher Name
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 3;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Lab No.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 5;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();         // Teacher Gender
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 5;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Requirement");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 7;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3 = new JTextField();        // Teacher Age
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 7;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Course Number");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 9;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_4 = new JTextField();     // Course Number
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 9;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Course Information");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 11;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_5 = new JTextField();     // Course Info
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 11;
		contentPane.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Feedback");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 13;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_6 = new JTextField();       // Feedback
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 3;
		gbc_textField_6.gridy = 13;
		contentPane.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tIDString = textField.getText();
				if(function.find(tIDString)!=-1)
	    		 {
	    			 JOptionPane.showMessageDialog(null, "The teacher ID already exists!\n\n Please enter again");   			 
	    			 //Empty text box
	    			 textField.setText("");
	    			 textField_1.setText("");
	    			 textField_2.setText("");
	    			 textField_3.setText("");
	    			 textField_4.setText("");
	    			 textField_5.setText("");
	    			 textField_6.setText("");
	    			 return;
	    		 }      	
				String tNameString = textField_1.getText();
				if(tIDString.equals("")||tNameString.equals(""))
	    		 {
	    			 JOptionPane.showMessageDialog(null, "The teacher already exists!\n\n Please enter again");
	    			 return;
	    		 }  

				String tLabNoString = textField_2.getText();
				if(tLabNoString.equals(""))
					tLabNoString="--";
				String tRequirementString = textField_3.getText();
				 if(tRequirementString.equals(""))    //If the age is empty, there is no input
					 tRequirementString="--";
				String tCouNumString = textField_4.getText();
				if(tCouNumString.equals(""))
					tCouNumString="--";
				String tCouInfoString = textField_5.getText();
				if(tCouInfoString.equals(""))
					tCouInfoString="--";
				String tFeedbackString = textField_6.getText();
				if(tFeedbackString.equals(""))
					tFeedbackString="--";
				
				teacher.setTeacherID(tIDString);
				teacher.setRequirement(tRequirementString);
				teacher.setName(tNameString);
				teacher.setLabNo(tLabNoString);
				teacher.setCourseNumber(tCouNumString);
				teacher.setCourseInfo(tCouInfoString);
				teacher.setFeedback(tFeedbackString);

				function.add(teacher);
				function.writefile();
				
				JOptionPane.showMessageDialog(null, "Added successfully£¡");
				setVisible(false);
				new StaffInterface();
				
				//Empty text box
   			 	textField.setText("");
   			 	textField_1.setText("");
   			 	textField_2.setText("");
   			 	textField_3.setText("");
   			 	textField_4.setText("");
   			 	textField_5.setText("");
   			 	textField_6.setText("");
				
   			 	

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 15;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tIDString = textField.getText();
				int flag = function.find(tIDString);
				if (flag == 1) {
					JOptionPane.showMessageDialog(null, "The teacher was not found!\n\n Please enter again");
				}
				else {
					function.delete(tIDString); 
					function.writefile();
       		     	JOptionPane.showMessageDialog(null, "Deleted successfully!\n");
				 }
				
				//Empty text box
   			 	textField.setText("");
   			 	textField_1.setText("");
   			 	textField_2.setText("");
   			 	textField_3.setText("");
   			 	textField_4.setText("");
   			 	textField_5.setText("");
   			 	textField_6.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 16;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tIDString = textField.getText();
				int flag = function.find(tIDString);
				if (flag == 1) {
					JOptionPane.showMessageDialog(null, "The teacher was not found!\n\n Please enter again");
				}
				else {
					JOptionPane.showMessageDialog(null, "The teacher data was existed in the system !");
				 }
				String tNameString = textField_1.getText();
				if(tIDString.equals("")||tNameString.equals(""))
	    		 {
	    			 JOptionPane.showMessageDialog(null, "The teacher already exists!\n\n Please enter again");
	    			 return;
	    		 }  

				String tLabNoString = textField_2.getText();
				if(tLabNoString.equals(""))
					tLabNoString="--";
				String tRequirementString = textField_3.getText();
				 if(tRequirementString.equals(""))   //If the age is empty, there is no input
					 tRequirementString="--";
				String tCouNumString = textField_4.getText();
				if(tCouNumString.equals(""))
					tCouNumString="--";
				String tCouInfoString = textField_5.getText();
				if(tCouInfoString.equals(""))
					tCouInfoString="--";
				String tFeedbackString = textField_6.getText();
				if(tFeedbackString.equals(""))
					tFeedbackString="--";
				
				teacher.setTeacherID(tIDString);
				teacher.setRequirement(tRequirementString);
				teacher.setName(tNameString);
				teacher.setLabNo(tLabNoString);
				teacher.setCourseNumber(tCouNumString);
				teacher.setCourseInfo(tCouInfoString);
				teacher.setFeedback(tFeedbackString);

				function.add(teacher);
				function.writefile();
				JOptionPane.showMessageDialog(null, "Modified successfully !");
				
				//Empty text box
   			 	textField.setText("");
   			 	textField_1.setText("");
   			 	textField_2.setText("");
   			 	textField_3.setText("");
   			 	textField_4.setText("");
   			 	textField_5.setText("");
   			 	textField_6.setText("");
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 17;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("QUERY A PTT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tIDString = textField.getText();
				if (tIDString.equals(""))
					tIDString = "--";

				String tNameString = textField_1.getText();
				if(tNameString.equals(""))
					tNameString="--";
				String tLabNoString = textField_2.getText();
				if(tLabNoString.equals(""))
					tLabNoString="--";
				String tRequirementString = textField_3.getText();
				if(tRequirementString.equals(""))
					tRequirementString="--";
				String tCouNumString = textField_4.getText();
				if(tCouNumString.equals(""))
					tCouNumString="--";
				String tCouInfoString = textField_5.getText();
				if(tCouInfoString.equals(""))
					tCouInfoString="--";
				String tFeedbackString = textField_6.getText();
				if(tFeedbackString.equals(""))
					tFeedbackString="--";

				// Write the query that meets the conditions into the file
				FileWriter fw = null;
				BufferedWriter out = null; 
				try {
					fw = new FileWriter("temp.txt");
					out = new BufferedWriter(fw);
					
					out.write(tIDString + "  ");
					out.write(tNameString + "  ");
					out.write(tLabNoString + "  ");
					out.write(tRequirementString + "  ");
					out.write(tCouNumString + "  ");
					out.write(tCouInfoString + "  ");
					out.write(tFeedbackString + "  "); 

					out.close();
					fw.close();

				} catch (IOException e1) {
					e1.printStackTrace();

				}
				// Query all
				new SystemQuery();

				// Empty text box
				textField.setText("");

			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 3;
		gbc_btnNewButton_3.gridy = 18;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("QUERY PTT LIST");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new SystemQueryAll();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.gridx = 3;
		gbc_btnNewButton_4.gridy = 19;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);
	}

}

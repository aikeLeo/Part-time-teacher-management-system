package assessedExercise2;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.io.*;

import java.util.ArrayList;
import java.util.Vector;


public class SystemQueryAll {
	JTable table = null;
    DefaultTableModel model = null;
	//Show all teacher information
   public SystemQueryAll() {
	    JFrame jf = new JFrame("Results of part time teacher information");	   
	    // Create content panel
	     JPanel panel = new JPanel();
	    // Header (column name)
	   Vector columnNames=createColumnNames();
	   Vector data=createTableModelData();	   
	 // Create a default tabular model
	    model = new DefaultTableModel(data, columnNames);
	   table = new JTable(model);
       table.setPreferredScrollableViewportSize(new Dimension(400, 80));
       JScrollPane tablePanel = new JScrollPane(table);  				        
	        // Set the table content color
	        table.setForeground(Color.BLACK);                   
	        table.setFont(new Font(null, Font.PLAIN, 14));      
	        table.setSelectionForeground(Color.DARK_GRAY);    
	        table.setSelectionBackground(Color.LIGHT_GRAY);     
	        table.setGridColor(Color.GRAY);                     

	        // Set the header
	        table.getTableHeader().setFont(new Font(null, Font.BOLD, 14));  
	        table.getTableHeader().setForeground(Color.RED);                
	        table.getTableHeader().setResizingAllowed(false);               
	        table.getTableHeader().setReorderingAllowed(false);            

	        // Set row height
	        table.setRowHeight(40);

	        // Set the width of the first column to 40
	        table.getColumnModel().getColumn(0).setPreferredWidth(40);
             
	        // Set the viewport size of the scroll panel
	        table.setPreferredScrollableViewportSize(new Dimension(900, 320));
	        
	        //Sorter	        
	        RowSorter sorter = new TableRowSorter(model);
	        table.setRowSorter(sorter);
	        JScrollPane pane = new JScrollPane(table);      

	        // Put the table in the scroll panel
	        JScrollPane scrollPane = new JScrollPane(table);

	        // Add scroll panel to content panel
	        panel.add(scrollPane);
	       // JScrollPane pane = new JScrollPane(table);
	        // Set the content panel to the window
	        jf.setContentPane(panel);
	        jf.pack();
	        jf.setSize(900, 600);
	        jf.add(scrollPane, BorderLayout.CENTER);
	        
	        //Data is displayed in the center
	        DefaultTableCellRenderer r = new DefaultTableCellRenderer();   
			r.setHorizontalAlignment(JLabel.CENTER);   
			table.setDefaultRenderer(Object.class, r);
			
	        jf.setLocationRelativeTo(null);
	        int t=table.getRowCount();
	        if(t<=0){
	        	JOptionPane.showMessageDialog(null, "No student information has been entered in the system!");
	        	jf.setVisible(false);
	        }
	        else {
	        	jf.setVisible(true);
	        }	 
	    }
    
     private Vector createColumnNames() {
       Vector columnNames = new Vector();

       columnNames.add("ID");
       columnNames.add("Name");
       columnNames.add("LabNumber");
       columnNames.add("Requirement");
       columnNames.add("CourseNumber");
       columnNames.add("CourseInfo");
       columnNames.add("Feedback");
       
       return columnNames;
   }
   
     private Vector createTableModelData() {
        
         Vector data = new Vector();
         String t=null;
			try{
				FileReader f1 = new FileReader("Storage.txt");
				BufferedReader br=new BufferedReader(f1);				
				//arry.clear();//	Clear the data in the original array list
				int i=0;
				while ((t= br.readLine())!= null)
					{
					  String [] s=t.split("\\s+");		//Split string array by spaces					  
					  Vector rowData = new Vector();
				
					  //rowData.add("i");
					  
					  rowData.add(s[0]);					  
					  rowData.add(s[1]);
					  rowData.add(s[2]);
					  rowData.add(s[3]);
					  rowData.add(s[4]);			  
					  rowData.add(s[5]);   
					  rowData.add(s[6]);				  
					  data.add(rowData);	
					  
					 // System.out.print(s[6]);					  
					  i++;					   
					}
				     f1.close();
				     br.close();			     
				     
					} catch (IOException e) {
							// TODO Auto-generated method stub
					e.printStackTrace();
					
				}	  
        return data;
     } 

}

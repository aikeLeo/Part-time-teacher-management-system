package assessedExercise2;

import javax.management.modelmbean.ModelMBean;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;


public class SystemQuery {	
	//Read teacher information and display it in a new window
		
		ArrayList<Teacher> arry=new ArrayList<Teacher>();
		Teacher stu=new Teacher();
		JTable table = null;
	    DefaultTableModel model = null;
		//Show all teacher information
	   public SystemQuery() {
		    JFrame jf = new JFrame("Results of eligible teacher information");

		    // Create content panel
		     JPanel panel = new JPanel();
		    // Header (column name)
	
		    Vector columnNames=createColumnNames();	    
		    //Use string array f to record what needs to be queried		       
			 String [] f = new String [7];
				try{
					FileReader f1 = new FileReader("temp.txt");
					BufferedReader br=new BufferedReader(f1);				

					String t=null;
					while ((t= br.readLine())!= null)
						{
						  f=t.split("\\s+");				 
						}
					
										
				  f1.close();
				  br.close();				  				  
					} catch (IOException e) {
								
					e.printStackTrace();						
					}
								
				
				 File file =new File("temp.txt");
			        try {
			            if(!file.exists()) {
			                file.createNewFile();
			            }
			            FileWriter fileWriter =new FileWriter(file);
			            fileWriter.write("");
			            fileWriter.flush();
			            fileWriter.close();			    		            
			        } catch (IOException e) {
			            e.printStackTrace();			         
			        }		
			    
				//Determine what conditions need to be queried				
				ArrayList List = new ArrayList(); 
				for(int i=0;i<7;i++) {
					if(!f[i].equals("--"))     
						List.add(i); 							
				}
				//Enter the teacher information that meets the query conditions into the system				 
				for(int i=0;i<List.size();i++)
					System.out.println(List.get(i));
				try{
						FileReader f1 = new FileReader("Storage.txt");
						BufferedReader br=new BufferedReader(f1);
						String t=null;
						int flag=0;
				        int t1=0;
				        
						arry.clear();//	Clear the data in the original array list					
						while ((t= br.readLine())!= null)
							{
							  String [] s=t.split("\\s+");		
							 for(int i=0;i<List.size();i++)
							 {
								 t1=(int) List.get(i);
								 if(f[t1].equals(s[t1])) {
									 flag=flag+1;
								 }
							 }
							  if(flag==List.size()) {
								  Teacher st=new Teacher(s[0],s[1],s[2],s[3],s[4],s[5],s[6]);
								 arry.add(st);
							  }							  
							  flag=0;
							  
							}
						     f1.close();
						     br.close();						     						     
							} catch (IOException e) {
									
							e.printStackTrace();				
						}	
		    	 				
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
	             
		        
		        table.setPreferredScrollableViewportSize(new Dimension(900, 320));
		        //Sorter	        
		        RowSorter sorter = new TableRowSorter(model);
		        table.setRowSorter(sorter);
		        JScrollPane pane = new JScrollPane(table);      

		        
		        JScrollPane scrollPane = new JScrollPane(table);

		        
		        panel.add(scrollPane);

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
				int t=arry.size();
				 //int t=table.getRowCount();
			        if(t<=0){
			        	JOptionPane.showMessageDialog(null, "No eligible students£¡");
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
         for(int i=0;i<arry.size();i++) {       	 
	    	 Vector<String> rowData=new Vector<>();	    	
	    	 rowData.add(arry.get(i).getTeacherID());
	    	 rowData.add(arry.get(i).getName());
	    	 rowData.add(arry.get(i).getLabNo());
	    	 rowData.add(arry.get(i).getRequirement());
	    	 rowData.add(arry.get(i).getCourseNumber());
	    	 rowData.add(arry.get(i).getCourseInfo());
	    	 rowData.add(arry.get(i).getFeedback());			    	 		    					  
    		 data.add(rowData);
    					  	    							   
		  }	   
         return data;
	  }  
    
}


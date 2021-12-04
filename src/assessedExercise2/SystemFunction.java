package assessedExercise2;

import java.io.*;
import java.util.*;

class SystemFunction {
	
	ArrayList<Teacher> arry = new ArrayList<Teacher>();

	public SystemFunction()           //Read the file and store the teacher information in the file in an array list
	{
		this.readfile();
	}

	// Find teacher information according to student ID, return teacher ID if find, return -1 if not found
	public int find(String str) {
		for (int i = 0; i < arry.size(); i++)
			if (arry.get(i).getTeacherID().equals(str))
				return i;
		return -1;
	}

	// Modify teacher information
	public void update(Teacher tea) {
		int flag = find(tea.getTeacherID()); // Query exists
		arry.set(flag, tea); // Replace the teacher information at the flag
	}

	// Read the file
	public boolean readfile() {
		String t = null;
		try{
			FileReader f1 = new FileReader("Storage.txt");
			BufferedReader br=new BufferedReader(f1);				
			arry.clear();    //		Clear the data in the original array list			
			while ((t= br.readLine())!= null)
				{
				  String [] s=t.split("\\s+");				 
				  Teacher te = new Teacher(s[0],s[1],s[2],s[3],s[4],s[5],s[6]);
				  arry.add(te);
				  System.out.println("Read the file:");
				  System.out.println(s[0]);
				}
			     f1.close();
			     br.close();				     
			     return true;
				} catch (IOException e) {
						// TODO 自动生成的 catch 块
				e.printStackTrace();
				return false;
			}	
	}

	// Add teacher information
	public boolean add(Teacher tea) {
		System.out.println();
		System.out.println("Teachers that have been added:");
		System.out.println(tea.fileString());
		System.out.println();
		if (find(tea.getTeacherID()) != -1)
			return false;
		arry.add(tea);
		return true;
	}

	// Each line must have seven elements, otherwise there will be errors when reading the file
	public boolean writefile() {
		FileWriter fw = null;
		BufferedWriter out = null;
		try {
			fw = new FileWriter("Storage.txt");
			out = new BufferedWriter(fw);
			// A space in between
			for (int i = 0; i < arry.size(); i++) {
				String s = arry.get(i).fileString();
				System.out.println("TXT text data:");
				System.out.println(arry.get(i).fileString());
				out.write(s);
				out.newLine();
			}
			out.close();
			fw.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	// Delete teacher information and modify the content in the file
	public boolean delete(String s) // Delete teacher information
	{
		int pos = find(s);
		if (pos == -1)
			return false;

		arry.remove(pos);
		return true;
	}


}

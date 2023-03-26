package file_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the file name for creating a new file");
		filename= sc.next();
		
		
		File file= new File("C:\\Users\\LENOVO\\Desktop\\simplilearn\\FileCreation\\"+filename+".txt");
		
		try {
//			file.createNewFile();
//			System.out.println("file created !!!");
			
//			if(file.createNewFile())
//			{
//				System.out.println("the file created successfully!!!!\n");
//			}
//			else
//			{
//				if(file.exists())
//				{
//					System.out.println("file already exists!!!!");
//				}
//				
//			}
			
			
			if(file.exists())
			{
				System.out.println("file exists!!!");
				System.out.println("this name already exist try with another name");
			
			}
			else
			{
				file.createNewFile();
				System.out.println("file successfully created!!!!");
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

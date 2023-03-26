package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// code to create a new file 
		
		File file= new File("firstfile2.txt");
		
		try 
		{
			file.createNewFile();
			System.out.println("your file is created");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// code to write into a file
		
		try {
			FileWriter fw=  new FileWriter("firstfile2.txt");
			fw.write("hii this is my first file...!!!!!\n data updated !!!!!  \n \n hello ");
			System.out.println("data written in the file");
			fw.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//code to read a file
		
		
		try {
			Scanner sc= new Scanner(file);
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				if(file.delete())
		{
			System.out.println("I have deleted my file: "+file.getName());
		}
		else 
		{
			System.out.println("error in deleting the file!!!!");
		}
		
	}

}

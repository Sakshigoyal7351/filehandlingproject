package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Myfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//code to create a new file
		/*File file= new File("Myfile.txt");
		try 
		{
			file.createNewFile();
		} 
		catch (IOException e) {
			System.out.println("unable to create this file");
			e.printStackTrace();
		}*/
		
		
		//code to write to a file
		/*try {
			FileWriter filewriter = new FileWriter("Myfile.txt");
			filewriter.write("hii this is my first file \n this is ny new file");
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		//Reading a file
		/*File myfile= new File("Myfile.txt");
		try {
			Scanner sc= new Scanner(myfile);
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// deleting a new file 
		File myfile= new File("Myfile.txt");
		if(myfile.delete())
		{
			System.out.println("I have deleted "+ myfile.getName());
		}
		else
		{
			System.out.println("some problem occured while deleting the file");
		}
		
		
	}

}

package file_handling;

import java.io.File;
import java.util.Scanner;

public class file3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename;

		char ch;
		File directory= new File("C:\\Users\\LENOVO\\Desktop\\simplilearn\\FileCreation");
		
		Scanner sc= new Scanner(System.in);
		do
		{
		System.out.println("1. file creation ");
		System.out.println("2. writting operation ");
		System.out.println("3. reading a file ");
		System.out.println("4. delete file ");
		System.out.println("5. exit");
		
		System.out.println("enter your choice");
		int choice= sc.nextInt();
		
		switch(choice)
		{
		case 1:
			
			
			
			break;
			
			
		case 2:
			
			
			break;
			
		case 3:
			
			
			break;
		
		case 4: 
			
			
			break;
			
		case 5:
			
			
			break;
			
		default:
			
			System.out.println("your choice is incorrect. ");
			break;
		}
		
		System.out.println("do you want to continue(y/n)");
		 ch= sc.next().charAt(0);
		}
		
		while(ch=='y'|| ch=='Y');
		
		
	}

}

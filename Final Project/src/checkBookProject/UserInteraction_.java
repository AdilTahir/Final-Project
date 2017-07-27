package checkBookProject;
import java.io.*;

import java.util.Scanner;

public class UserInteraction_ {
	static boolean programStatus = true;
	static CheckBook_ book;
	static int j = 0;
	
	public static void main(String[] args){
		int u = 0;
		while (u < 1){//literally just in place to keep the array alive
			CheckBook_ book = new CheckBook_(); // generates the object that hold the checkbook array in it
			while (programStatus = true){//allows the menu to run forever
        	
            menu();
            
            System.out.println(programStatus + "system status, got the main()");
            System.out.println(book);
			}//while
        u++;
		}//while(u<1)
	}//main()
	
	
	public static void menu(){
	
		System.out.println("Welcome to your bank.");      
	    System.out.println("Please choose one:");
	    
	    
	    //System.out.println("3) View checking account balance.");
	    //System.out.println("4) Add money to check book balance.");
	    //System.out.println("6) Move checkbook to text file.");
	    System.out.println("1) Create a check in your checkbook.");
	    System.out.println("2) Print out checkbook.");
	    System.out.println("3) Serialize the checkbook.");
	    System.out.println("4) Quit.");
	    
	    
	    Scanner scanner = new Scanner(System.in);
	    int userInput = 0;
		if (scanner.hasNextInt()) {
			userInput = scanner.nextInt();
		}//if
		else{
			userInput = 4;
		}//else
		
	    switch(userInput){
	    case 1:
	    	caseOne(j);
	    	j++;
	    	System.out.println("You have " + (5 - j) + " checks left in your checkbook.");
	    	
			break;
	    
	    case 2:
	    	System.out.println("Your checkbook contains the following:");
	    	//System.out.println(CheckBook_.checkBookRegister + "-- Checkbook?");
	    	CheckBook_.printCheckBook();
	    	//Check_.printCheck();
	    	break;
	    	
	    case 3:
	    	
	    	break;
	    case 4:
	    	programStatus = false;
        	System.out.println("Thank you for using the bank today.");
        	System.exit(0);
        	scanner.close();
        	        	
	    	break;
	    	
	    }//switch(input) 
	
	}//menu()
	
	public static void caseOne(int j){
		int arrayInteraction = j;
		Bank_.addNewCheck(arrayInteraction);
		System.out.println(j + " --- this is J caseOne()");
		
	}//caseOne()
}//UserInteraction
	


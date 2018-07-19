
import java.util.Scanner;


public class keyboardInput {
	


	
	
	public static int getLocationRow() {
		boolean rowCheck = false;
		int locationRow = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (rowCheck == false) {
			System.out.println("Which row would you like to move it to? ");
			locationRow = keyboard.nextInt();
			rowCheck = true;
			
			if (locationRow > 7) {
				System.out.println("invalid input");
				rowCheck = false;
			}
			
			if (locationRow<0) {
				System.out.println("invalid input");
				rowCheck = false;
				
			}
		}

		return locationRow;
	}
	
	public static int getLocationColumn() {
		boolean columnCheck = false;
		Scanner keyboard = new Scanner (System.in);
		int locationColumn = 0;
		
		while (columnCheck == false) {
			System.out.println("Which column would you like to move it to? ");
			locationColumn = keyboard.nextInt();
			columnCheck = true;
			
			if(locationColumn < 0) {
				System.out.println("invalid input");
				columnCheck = false;
			}
			
			if(locationColumn > 7) {
				System.out.println("Invalid Input");
				columnCheck = false;
			}
			
		}
		return locationColumn;
	}
	
	public static String getPieceName () {
		System.out.println("Which piece would you like to move?");
		Scanner keyboard = new Scanner(System.in);
		String pieceName = keyboard.nextLine();
		return pieceName;
		
	}
	
	public static void exitPrompt() {
		System.out.println("Do you wish to exit? y/n? ");
		Scanner keyboard = new Scanner (System.in);
		String exitQ = keyboard.nextLine();
		
		if (exitQ.equals( "y")) {
			System.exit(0);
		}
		
	}
	
}

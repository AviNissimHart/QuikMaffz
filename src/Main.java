import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Calculations x = new Calculations();
		
		String action = "";
		action = getAction();
		
		do {
		switch(action) {
		case "add":
			System.out.println("Please enter first number");
			int addFirstNumber = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter second number");
			int addSecondNumber = Integer.parseInt(scan.nextLine());
			x.addition(addFirstNumber, addSecondNumber);
			break;
			
		case "sub":
			System.out.println("Please enter first number");
			int subFirstNumber = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter second number");
			int subSecondNumber = Integer.parseInt(scan.nextLine());
			x.subtraction(subFirstNumber, subSecondNumber);
			break;
			
		case "mult":
			System.out.println("Please enter first number");
			int multFirstNumber = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter second number");
			int multSecondNumber = Integer.parseInt(scan.nextLine());
			x.mutltiplication(multFirstNumber, multSecondNumber);
			break;
			
		case "div":
			System.out.println("Please enter first number");
			int divFirstNumber = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter second number");
			int divSecondNumber = Integer.parseInt(scan.nextLine());
			x.division(divFirstNumber, divSecondNumber);
			break;
			
		case "mod":
			System.out.println("Please enter first number");
			int modFirstNumber = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter second number");
			int modSecondNumber = Integer.parseInt(scan.nextLine());
			x.modulo(modFirstNumber, modSecondNumber);
			break;
			
		 default:
         	System.out.println("You haven't selected anything sweetheart!?!?!?!!");
			
		}
		
		
		action = getAction();
		
	} while (!action.equals("exit"));
		System.out.println("Cheerio! Farewell! Pip-Pip!");
		
//		x.addition(20, 25);
//		x.subtraction(20, 25);
//		x.division(50, 10);
//		x.modulo(20, 25);
	}

	 private static String getAction() {
	    	System.out.println("Please enter the desired calculation method");
	    	System.out.println("add, sub, mult, div, mod");
	    	return scan.nextLine();
	    }
}

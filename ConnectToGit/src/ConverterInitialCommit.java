import java.util.Scanner;

public class ConverterInitialCommit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usdConversions currency1 = new usdConversions(); //Connects the usdConversions class to the main class
		Scanner reader = new Scanner(System.in); //Scanner for multiple inputs
		System.out.println("1 US Dollar");  //Currency options
		System.out.println("2 Euro");
		System.out.println("3 Pound Sterling");
		System.out.println("4 Japanese Yen");
		System.out.println("5 Australian Dollar");
		System.out.println("6 Canadian Dollar");
		String again = "Y"; //Ask if the user wants to redo the program or not
		
		do
		{
		System.out.println("Enter the beginning currency (1-6): "); //Beginning currency 
		int begin = reader.nextInt();
		System.out.println("Enter the currecy to convert to (1-6): "); //Conversion currency
		int choice = reader.nextInt(); 
		System.out.println("Enter the amount you would like to convert: "); //Amount being converted
		double amount = reader.nextDouble();
		
		if (begin==1 && choice==2) //US Dollar to other currencies set up
		{
			System.out.println("US Dollar to Euro");//print statement to make sure it works
			System.out.println("*******************");
			System.out.println("Converted Amount: €"+ currency1.EUR(amount)+" EUR"); // Grabs the information from the EUR constructor and prints it.
		}
		else if (begin==1 && choice==3)
		{
			System.out.println("US Dollar to British Pound");//print statement to make sure it works
			System.out.println("*******************");
			System.out.println("Converted Amount: £"+ currency1.GBP(amount)+" GBP"); // Grabs the information from the GBP constructor and prints it.
		}
		else if (begin==1 && choice==4)
		{
			System.out.println("US Dollar to Japanese Yen");//print statement to make sure it works
			System.out.println("*******************");
			System.out.println("Converted Amount: ¥"+ currency1.JPY(amount)+" JPY"); // Grabs the information from the JPY constructor and prints it.
		}
		else if (begin==1 && choice==5)
		{
			System.out.println("US Dollar to Australian Dollar"); //print statement to make sure it works
			System.out.println("*******************");
			System.out.println("Converted Amount:  A$"+ currency1.AUD(amount)+" AUD"); // Grabs the information from the AUD constructor and prints it.
		}
		else if (begin==1 && choice==6)
		{
			System.out.println("US Dollar to Canadian Dollar");//print statement to make sure it works
			System.out.println("*******************");
			System.out.println("Converted Amount: C$"+ currency1.CAD(amount)+" CAD"); // Grabs the information from the CAD constructor and prints it.
		}
	System.out.println("Do you want to convert another currency (Y/N) ?"); //Repeat or not?
		again = reader.next();
		}while (again.equals("Y"));
		
	}

}

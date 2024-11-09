import java.util.Scanner;

public class ConverterInitialCommit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usdConversions currency1 = new usdConversions(); //Connects the usdConversions class to the main class
		eurConversions currency2= new eurConversions(); //connects the eurConversions class to the main
		GUIConversions gui = new GUIConversions();
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
		currency1.setCurrencyAmount(amount); //sets the amount that the user inputs into the amount in the usdConversions setCurrencyAmount method
		currency2.setCurrencyAmount(amount); // sets the amount that the user inputs into the amount variable in the eurConversions setCurrencyAMount method
		
		if (begin==1 && choice==2) //US Dollar to other currencies set up
		{
			System.out.println("US Dollar to Euro");//print statement to make sure it works
			System.out.println("*******************");
			currency1.EUR(); //performs the conversion of the user input to give each of the instance variables a value
			System.out.println(currency1.toString()); // Grabs the information from the EUR constructor and prints it.
		}
		else if (begin==1 && choice==3)
		{
			System.out.println("US Dollar to British Pound");//print statement to make sure it works
			System.out.println("*******************");
			currency1.GBP();//performs the conversion of the user input to give each of the instance variables a value
			System.out.println(currency1.toString()); // Grabs the information from the GBP constructor and prints it.
		}
		else if (begin==1 && choice==4)
		{
			System.out.println("US Dollar to Japanese Yen");//print statement to make sure it works
			System.out.println("*******************");
			currency1.JPY();//performs the conversion of the user input to give each of the instance variables a value
			System.out.println(currency1.toString()); // Grabs the information from the JPY constructor and prints it.
		}
		else if (begin==1 && choice==5)
		{
			System.out.println("US Dollar to Australian Dollar"); //print statement to make sure it works
			System.out.println("*******************");
			currency1.AUD();//performs the conversion of the user input to give each of the instance variables a value
			System.out.println(currency1.toString()); // Grabs the information from the AUD constructor and prints it.
		}
		else if (begin==1 && choice==6)
		{
			System.out.println("US Dollar to Canadian Dollar");//print statement to make sure it works
			System.out.println("*******************");
			currency1.CAD();//performs the conversion of the user input to give each of the instance variables a value
			System.out.println(currency1.toString()); // Grabs the information from the CAD constructor and prints it.
		}
		else if (begin==2 && choice==1)
		{
			System.out.println("Euro to US Dollar");
			System.out.println("*******************");
			currency2.USD(); //performs the conversion of the user input to give the instance variables from the eurConversions class a value
			System.out.println(currency2.toString());
		}
		else if (begin==2 && choice==3)
		{
			System.out.println("Euro to British Pound");
			System.out.println("*******************");
		}
		else if (begin==2 && choice==4)
		{
			System.out.println("Euro to Japanese Yen");
			System.out.println("*******************");
		}
		else if (begin==2 && choice==5)
		{
			System.out.println("Euro to Australian Dollar");
			System.out.println("*******************");
		}
		else if (begin==2 && choice==6)
		{
			System.out.println("Euro to Canadian Dollar");
			System.out.println("*******************");
		}
	System.out.println("Do you want to convert another currency (Y/N) ?"); //Repeat or not?
		again = reader.next();
		}while (again.equals("Y"));
		
	}

}

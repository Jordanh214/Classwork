import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class ConverterInitialCommit {

	public static void main(String[] args) throws FileNotFoundException { 
		// TODO Auto-generated method stub
		usdConversions currency1= new usdConversions(); //Connects the usdConversions class to the main 
		eurConversions currency2= new eurConversions(); //Connects the eurConversions class to the main
		gbpConversions currency3= new gbpConversions(); //Connects the gbpConversions class to the main
		jpyConversions currency4= new jpyConversions(); //Connects the jpyConversions class to the main
		audConversions currency5= new audConversions(); //Connects the audConversions class to the main
		cadConversions currency6= new cadConversions();
			
		
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
		currency1.setCurrencyAmount(amount); //sets the amount that the user inputs into the amount variable in the usdConversions setCurrencyAmount method
		currency2.setCurrencyAmount(amount); //sets the amount that the user inputs into the amount variable in the eurConversions setCurrencyAmount method
		currency3.setCurrencyAmount(amount); //sets the amount that the user inputs into the amount variable in the gbpConversions setCurrencyAmount method
		currency4.setCurrencyAmount(amount); //sets the amount that the user inputs into the amount variable in the jpyConversions setCurrencyAmount method
		currency5.setCurrencyAmount(amount); //sets the amount that the user inputs into the amount variable in the audConversions setCurrencyAmount method
		currency6.setCurrencyAmount(amount); //sets the amount that the user inputs into the amount variable in the cadConversions setCurrencyAmount method
		
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
			System.out.println(currency1.toString()); // Grabs the information from the GBP method and prints it.
		}
		else if (begin==1 && choice==4)
		{
			System.out.println("US Dollar to Japanese Yen");//print statement to make sure it works
			System.out.println("*******************");
			currency1.JPY();//performs the conversion of the user input to give each of the instance variables a value
			System.out.println(currency1.toString()); // Grabs the information from the JPY method and prints it.
		}
		else if (begin==1 && choice==5)
		{
			System.out.println("US Dollar to Australian Dollar"); //print statement to make sure it works
			System.out.println("*******************");
			currency1.AUD();//performs the conversion of the user input to give each of the instance variables a value
			System.out.println(currency1.toString()); // Grabs the information from the AUD method and prints it.
		}
		else if (begin==1 && choice==6)
		{
			System.out.println("US Dollar to Canadian Dollar");//print statement to make sure it works
			System.out.println("*******************");
			currency1.CAD();//performs the conversion of the user input to give each of the instance variables a value
			System.out.println(currency1.toString()); // Grabs the information from the CAD method and prints it.
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
			currency2.GBP();
			System.out.println(currency2.toString());
		}
		else if (begin==2 && choice==4)
		{
			System.out.println("Euro to Japanese Yen");
			System.out.println("*******************");
			currency2.JPY();
			System.out.println(currency2.toString());
		}
		else if (begin==2 && choice==5)
		{
			System.out.println("Euro to Australian Dollar");
			System.out.println("*******************");
			currency2.AUD();
			System.out.println(currency2.toString());
		}
		else if (begin==2 && choice==6)
		{
			System.out.println("Euro to Canadian Dollar");
			System.out.println("*******************");
			currency2.CAD();
			System.out.println(currency2.toString());
		}
		else if (begin==3 && choice==1)
		{
			System.out.println("British Pound to US Dollar");
			System.out.println("******************");
			currency3.USD();
			System.out.println(currency3.toString());
		}
		else if (begin==3 && choice==2)
		{
			System.out.println("British Pound to Euro");
			System.out.println("******************");
			currency3.EUR();
			System.out.println(currency3.toString());
		}
		else if (begin==3 && choice==4)
		{
			System.out.println("British Pound to Japanese Yen");
			System.out.println("******************");
			currency3.JPY();
			System.out.println(currency3.toString());
		}
		else if (begin==3 && choice==5)
		{
			System.out.println("British Pound to Australian Dollar");
			System.out.println("******************");
			currency3.AUD();
			System.out.println(currency3.toString());
		}
		else if (begin==3 && choice==6)
		{
			System.out.println("British Pound to Canadian Dollar");
			System.out.println("******************");
			currency3.CAD();
			System.out.println(currency3.toString());
		}
		else if (begin==4 && choice==1)
		{
			System.out.println("Japanese Yen to US Dollar");
			System.out.println("*******************");
			currency4.USD();
			System.out.println(currency4.toString());
		}
		else if (begin==4 && choice==2)
		{
			System.out.println("Japanese Yen to Euro");
			System.out.println("*******************");
			currency4.EUR();
			System.out.println(currency4.toString());
		}
		else if (begin==4 && choice==3)
		{
			System.out.println("Japanese Yen to British Pound");
			System.out.println("*******************");
			currency4.GBP();
			System.out.println(currency4.toString());
		}
		else if (begin==4 && choice==5)
		{
			System.out.println("Japanese Yen to Australian Dollar");
			System.out.println("*******************");
			currency4.AUD();
			System.out.println(currency4.toString());
		}
		else if (begin==4 && choice==6)
		{
			System.out.println("Japanese Yen to Canadian Dollar");
			System.out.println("*******************");
			currency4.CAD();
			System.out.println(currency4.toString());
		}
		else if (begin==5 && choice==1)
		{
			System.out.println("Australian Dollar to US Dollar");
			System.out.println("*******************");
			currency5.USD();
			System.out.println(currency5.toString());
		}
		else if (begin==5 && choice==2)
		{
			System.out.println("Australian Dollar to Euro");
			System.out.println("*******************");
			currency5.EUR();
			System.out.println(currency5.toString());
		}
		else if (begin==5 && choice==3)
		{
			System.out.println("Australian Dollar to British Pound");
			System.out.println("*******************");
			currency5.GBP();
			System.out.println(currency5.toString());
		}
		else if (begin==5 && choice==4)
		{
			System.out.println("Australian Dollar to Japanese Yen");
			System.out.println("*******************");
			currency5.JPY();
			System.out.println(currency5.toString());
		}
		else if (begin==5 && choice==6)
		{
			System.out.println("Australian Dollar to Canadian Dollar");
			System.out.println("*******************");
			currency5.CAD();
			System.out.println(currency5.toString());
		}
		else if (begin==6 && choice==1)
		{
			System.out.println("Canadian Dollar to US Dollar");
			System.out.println("*******************");
			currency6.USD();
			System.out.println(currency6.toString());
		}
		else if (begin==6 && choice==2)
		{
			System.out.println("Canadian Dollar to Euro");
			System.out.println("*******************");
			currency6.EUR();
			System.out.println(currency6.toString());
		}
		else if (begin==6 && choice==3)
		{
			System.out.println("Canadian Dollar to British Pound");
			System.out.println("*******************");
			currency6.GBP();
			System.out.println(currency6.toString());
		}
		else if (begin==6 && choice==4)
		{
			System.out.println("Canadian Dollar to Japanese Yen");
			System.out.println("*******************");
			currency6.JPY();
			System.out.println(currency6.toString());
		}
		else if (begin==6 && choice==5)
		{
			System.out.println("Canadian Dollar to Australian Dollar");
			System.out.println("*******************");
			currency6.AUD();
			System.out.println(currency6.toString());
		}
		else
			System.out.println("Invalid Input. Please Convert using the currencies provided. (1-6)");
		
	System.out.println("Do you want to convert another currency (Y/N) ?"); //Repeat or not?
		again = reader.next();
		}while (again.equals("Y"));
		
	}

}

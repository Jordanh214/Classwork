 
public class usdConversions { //Conversions for the U.S Dollar
	private double cadConversionRate = 1.41; //Amount of Canadian Dollars per U.S Dollar
	private double gbpConversionRate = 0.79; //Amount of Pound per U.S Dollar
	private double eurConversionRate = 0.95; //Amount of Euro per U.S Dollar
	private double jpyConversionRate = 149.26; //Amount of Japanese Yen per U.S Dollar
	private double audConversionRate = 1.54; //Amount of Australian Dollars per U.S Dollar
	
	private double currencyAmount; //instance variable for amount
	private String currencySymbol; //instance variable that sets the type of currency for each conversion
	private String currencyName; //instance variable that adds the abbreviation for each currency //https://websparrow.org/java/java-heap-memory-vs-stack-memory-understanding-the-differences#:~:text=The%20heap%20memory%20is%20used%20for%20dynamic,memory%20stores%20method%20calls%20and%20local%20variables.
	private double convertedAmount; //instance variable to hold the converted amount
	
	public double setCurrencyAmount(double amount)
	{
		currencyAmount = amount; //gets the user input and gives it to the currencyAmount variable
		return currencyAmount; //returns the currency amount variable
	}
	

	public double CAD() //Constructor for converting USD into CAD //https://www.youtube.com/watch?v=h8EnX87gX9o&ab_channel=AJ looked up for constructor help
	{
		currencyName="CAD"; // Abbreviation for the canadian dollar
		currencySymbol ="C$"; //sets the currency symbol to the Canadian dollar symbol
		convertedAmount = currencyAmount * cadConversionRate; //Converts the amount of usd to cad
		return convertedAmount; // returns the converted amount
	}
	
	public double GBP() //Constructor for converting USD into GBP
	{
		currencyName="GBP"; //abbreviation for British Pound Sterling
		currencySymbol = "£"; //sets the currency symbol to the pound symbol
		convertedAmount = currencyAmount * gbpConversionRate; //Converts the amount of usd to gbp
		return convertedAmount; // returns the converted amount
	}
	
	public double EUR() //Constructor for converting USD into EUR
	{
		currencyName = "EUR"; //abbreviation for Euro
		currencySymbol = "€"; //sets the currency symbol to the euro symbol
		convertedAmount = currencyAmount * eurConversionRate; //Converts the amount of usd to eur
		return convertedAmount; // returns the converted amount
		
	}
	
	public double JPY() //Constructor for converting USD into JPY
	{
		currencyName = "JPY"; //abbreviation for Japanese Yen
		currencySymbol = "¥"; //sets the currency symbol to the yen symbol
		convertedAmount = currencyAmount * jpyConversionRate; //Converts the amount of usd to jpy
		return convertedAmount; // returns the converted amount
	}
	
	public double AUD() //Constructor for converting USD into AUD
	{
		currencyName = "AUD"; //abbreviation for Australian Dollar
		currencySymbol = "A$";//sets the currency symbol to the Australian dollar symbol
		convertedAmount = currencyAmount * audConversionRate; //Converts the amount of usd to aud
		return convertedAmount; // returns the converted amount
	}
	
	public String toString() //https://stackoverflow.com/questions/6431933/how-to-format-strings-in-java, //https://www.geeksforgeeks.org/java-string-format-method-with-examples/
	{
		String conversionFormat = String.format("Converted Amount: %s %,.2f %s", currencySymbol, convertedAmount, currencyName); //formats the objects for printing.
		return conversionFormat; //returns the conversionFormat variable to the output for toString in the main
	}
	

}

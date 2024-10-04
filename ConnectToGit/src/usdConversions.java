
public class usdConversions { //Conversions for the U.S Dollar
	private double cadConversionRate = 1.36; //Amount of Canadian Dollars per U.S Dollar
	private double gbpConversionRate = 0.76; //Amount of Pound per U.S Dollar
	private double eurConversionRate = 0.91; //Amount of Euro per U.S Dollar
	private double jpyConversionRate = 146.22; //Amount of Japanese Yen per U.S Dollar
	private double audConversionRate = 1.46; //Amount of Australian Dollars per U.S Dollar
	
	public double CAD(double amount) //Constructor for converting USD into CAD
	{
		return amount * cadConversionRate;
	}
	
	public double GBP(double amount) //Constructor for converting USD into CAD
	{
		return amount * gbpConversionRate;
	}
	
	public double EUR(double amount) //Constructor for converting USD into CAD
	{
		return amount * eurConversionRate;
	}
	
	public double JPY(double amount) //Constructor for converting USD into JPY
	{
		return amount * jpyConversionRate;
	}
	
	public double AUD(double amount) //Constructor for converting USD into AUD
	{
		return amount * audConversionRate;
	}

}

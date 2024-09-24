
public class overloadingMethods {

	public static void main(String[] args) {
		int num=doubleNumber(4);
		System.out.println(num);
		double numD=doubleNumber(4.5);
		System.out.println(numD);

	}
	
	public static int doubleNumber(int n)
	{
		int total=n*n;
		return total;
	
	}
	
	public static double doubleNumber(double n)
	{
		double total=n*n;
		return total;
	}

}

import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Send 2 numbers, return the sum of both, send 3 numbers, 4 numbers)
		Scanner reader=new Scanner(System.in);
		int num1=doubleNumber(4, 7);
		System.out.println(num1);
		int num2=doubleNumber(4,7,2);
		System.out.println(num2);
		int num3=doubleNumber(6, 12, 15,3);
		System.out.println(num3);
		
		

	}
	public static int doubleNumber(int n, int n1)
	{
		int total=n+n1;
		return total;
	}
	
	public static int doubleNumber(int n, int n1, int n2)
	{
		int total=n+n1+n2;
		return total;
	}
	
	public static int doubleNumber(int n, int n1, int n2, int n3)
	{
		int total=n+n1+n2+n3;
		return total;
	}

}

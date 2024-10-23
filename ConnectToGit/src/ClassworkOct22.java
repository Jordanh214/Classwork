import java.util.Scanner;

public class ClassworkOct22 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		String[] seat= new String[10];
		System.out.println("There are 10 seats, How many you would like to reserve?");
		int numSeats=reader.nextInt();
		
		for (int i = 0;i<seat.length; i++)
		{
			seat[i]="This seat has not been reserved";
		}
		
		for(int i=0;i<numSeats;i++)
		{
			System.out.println("What seat would you like to reserve (0-9)? ");
			int reservedSeats=reader.nextInt();
			
			if(seat[reservedSeats].equals("R"))
			{
				System.out.println("This seat is already reserved. Please Choose another");
				i--;
			}
			else
				seat[reservedSeats]="R";
			
		}
		
		System.out.println();
		System.out.println("Reserved Seats: ");
		for(int i=0;i<seat.length;i++)
		{
			System.out.println(seat[i]+ " ");
		}
		

	}

}

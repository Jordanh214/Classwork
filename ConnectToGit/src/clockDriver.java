import java.util.Scanner;

public class clockDriver {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Clock myClock=new Clock();
		Clock yourClock=new Clock(33,4,5);
		myClock.setTime(1,2,3);
		myClock.setHour(23);
		System.out.println(yourClock.getHour());
		System.out.println(myClock);
		myClock.incrementHours();
		System.out.println(myClock);
		yourClock.incrementMinutes();
		System.out.println(yourClock);
		yourClock.printTime();
		myClock.printTime();
		System.out.print("/n");
		System.out.println(myClock.toString());
	
		

	}

}

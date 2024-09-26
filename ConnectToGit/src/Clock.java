
public class Clock {
	private int hr;
	private int min;
	private int sec;
	
//Constructor Method (Overloaded) | Constructors must be called same as class
	public Clock()
	{
		setTime(0,0,0);
	}
	
	public Clock(int hours, int minutes, int seconds)
	{
		setTime(hours, minutes, seconds);

	}
	
	public void setHour()
	{
		hr=hours;
	}
	
	//Getter/Accessor methods
	public int getHour()
	{
		return hr;
	}

	
	//regular methods
	public void setTime(int hours, int minutes, int seconds)
	{
		if (hours>=0 && hours <24)
			hr=hours;
		else
			hr=0;
		if (minutes>=0 && minutes<60)
			min=minutes;
		else
			min=0;
		if (seconds>=0 && seconds<60)
			sec=seconds;
		else
			sec=0;
	}
	
	public void incrementHours()
	{
		hr++;
		if (hr>23)
			hr=0;
	}
	
	public void incrementMinutes()
	{
		min++;
		if (min>59)
		{
			min=0;
			incrementHours();
		}
	}
	
	public void incrementSeconds()
	{
		sec++;
		if (sec>59)
		{
			sec=0;
			incrementMinutes();
		}
	}
	
	public void printTime()
	{
		System.out.print("\n");
		if (hr<10)
			System.out.print(0);
		System.out.print(hr);
		System.out.print(":");
		if (min<10)
			System.out.print(0);
		System.out.print(min);
		System.out.print(":");
		if (sec<10)
			System.out.print(0);
		System.out.print(sec);
		System.out.print(":");
		
	}
	
	public String toString()
	{
		String pClock="Hour: ";
		if (hr<10)
			pClock+="0";
		pClock+=""+hr+"\nMinute: ";
		if (min<10)
			pClock+="0";
		pClock+=""+min+"\nSecond: ";
		if (sec<10)
			pClock+="0";
		pClock+=""+sec;
		return pClock;
	}
}


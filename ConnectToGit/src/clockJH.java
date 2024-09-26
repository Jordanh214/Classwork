
public class clockJH {
//instance variables 
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
		hr=hours;
		min=minutes;
		sec=seconds;
	}
}

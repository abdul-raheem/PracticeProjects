package DieterLessons;

public class Time1 {
	public int hour = 5;
	private int minute = 5;
	private int second = 5;
	
	public String Time1(String str)
	{
		return str;
	}
	
	public Time1()
	{
		
	}
	

	public  Time1(int hour, int m, int s)
	{
		
		this.hour = getHour();
		m = getMinute();
		s = getSecond();
		
	}
	
	public Time1(Time1 time)
	{
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
	public int getHour()
	{
		this.hour = ((hour >= 0 && hour < 24) ? hour:0);
		return hour;
	}
	
	public int getMinute()
	{
		minute = ((minute >= 0 && minute < 60) ? minute:0);
		return minute;
	}
	
	public int getSecond()
	{
		second = ((second >= 0 && second < 60) ? second:0);
		return second;
	}
	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	
	public String toString()
	{
		return String.format("%d:%02d:%02d %s" , ((hour == 0 || hour == 12 ) ? 12 : hour % 12 ), 
				minute, second, (hour < 12 ? "AM" : "PM"));
	}

}

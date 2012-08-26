package DieterLessons;

public class Time1 {
	public  int hour = 5;
	public int minute = 5;
	public int second = 5;
	
	public String Time1(String str)
	{
		return str;
	}
	
	public Time1()
	{
		
	}
	

	public  Time1(int ho, int mi, int se)
	{
		
		getHour(ho);
		getMinute(mi);
	     getSecond(se);
		
	}
	
	/**public Time1(Time1 time)
	{
		this(time.getHour(),time.getMinute(),time.getSecond());
	}**/
	public int getHour(int hou)
	{
		hour = ((hou >= 0 && hou < 24) ? hou:0);
		return hour;
	}
	
	public int getMinute(int minu)
	{
		minute = ((minu >= 0 && minu < 60) ? minu:0);
		return minute;
	}
	
	public int getSecond(int second)
	{
		second = ((second >= 0 && second < 60) ? second:0);
		return second;
	}
	/**public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	**/
	public String toString()
	{
		return String.format("%d:%02d:%02d %s" , ((hour == 0 || hour == 12 ) ? 12 : hour % 12 ), 
				minute,second, (hour < 12 ? "AM" : "PM"));
	}

}

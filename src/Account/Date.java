package Account;

public class Date {
	int month;
	int day;
	int Year;
	public Date(int month,int day,int year)
	{
	this.month=month;
	this.day=day;
	this.Year=year;
	}
	public void setmonth(int m)
	{
		this.month=m;
	}
	public void setday(int d)
	{
		this.day=d;
	}
	public void setyear(int y)
	{
	     this.Year=y;	
	}
	public int getmonth()  
	{
      return month;
	}
	public int getday()
	{
		return day;
	}
	public int getyear()
	{
		return Year;
	}
	
    public void displayYear(int m,int d,int y)
    {
    	System.out.println("Year is :"+m+"/"+d+"/"+y);
    }
}

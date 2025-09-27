package Account;

import java.util.Scanner;

public class HealthProfile {
	String First_name;
	String Last_name,gender;
	int mm,dd,yr,height,weight;
	public  HealthProfile(String First_name,String Last_name,String gender,int mm,int dd,int yr,int height,int weight)
	{
		this.First_name=First_name;
		this.Last_name=Last_name;
		this.gender=gender;
		this.mm=mm;
		this.dd=dd;
		this.yr=yr;
		this.height=height;
		this.weight=weight;
	}
	public void setFirstnm(String fn)
	{
	 this.First_name=fn;	
	}
	public void setLastnm(String ln) {
		this.Last_name=ln;
	}
	public void setgender(String gndr)
	{
		this.gender=gndr;
	}
	public void setmonth(int m)
	{
		this.mm=m;
	}
	public void setday(int d)
	{
		this.dd=d;
	}
	public void setyr(int year)
	{
		this.yr=year;
	}
	public void setheight(int ht)
	{
		this.height=ht;
	}
	public void setweight(int wt)
	{
		this.weight=wt;
	}
	public String getFirstnm()
	{
	 return this.First_name;	
	}
	public String getLastnm() {
		return this.Last_name;
	}
	public String getgender()
	{
		return this.gender;
	}
	public int getweight()
	{
		return this.weight;
	}
	public int getheight()
	{
		return this.height;
	}
	public int getmonth()
	{
		return this.mm;
	}
	public int getday()
	{
		return this.dd;
	}
	public int getyr()
	{
		return this.yr;
	}
	public int ag_in_yrs(int yr)
	{
	  int age=2022-yr;
	  return age;
	}
	public int maximum_heart_rate(int ag)
	{
		int max=220-ag;
		return max;
	}
	public double lower(int m)
	{
		double d=(.5*m);
		return d;
	}
	public double upper(int m)
	{
		double v=(.85*m);
		return v;
	}
	public double BMI(int wt,int ht)
	{
		double bm=(wt*703)/(ht*ht);
		return bm;
	}
	public static void main(String[] args) {
		HealthProfile hr=new HealthProfile("Athira","Mohandas","Female",11,8,1987,163,200);
		Scanner sr=new Scanner(System.in);
		System.out.println("enter the first name");
		String f_name=sr.next();
		hr.setFirstnm(f_name);
		System.out.println("Enter the Last Name");
       	String L_name=sr.next();
       	hr.setLastnm(L_name);
       	System.out.println("Enter the Gender");
       	String sex=sr.next();
       	hr.setgender(sex);
       	System.out.println("Enter the month of date of Birth");
        int month=sr.nextInt();
        hr.setmonth(month);
        System.out.println("Enter the day of the month");
        int day=sr.nextInt();
        hr.setday(day);
        System.out.println("enter the year");
        int year=sr.nextInt();
        hr.setyr(year);
        System.out.println("Enter the Height");
        int ht=sr.nextInt();
        hr.setheight(ht);
        System.out.println("Enter the weight");
        int wt=sr.nextInt();
        hr.setweight(wt);
        System.out.println("Details of the person is:");
        System.out.println("name:"+hr.getFirstnm()+" "+hr.getLastnm());
        System.out.println("The date of Birth is:");
        System.out.println(hr.getmonth()+"-"+hr.getday()+"-"+hr.getyr());
        System.out.println("Gender is:"+hr.getgender());
        int ag=hr.ag_in_yrs(year);
        int max_hr=hr.maximum_heart_rate(ag);
        double thrL=hr.lower(max_hr);
        double thrU=hr.upper(max_hr);
        double bm=hr.BMI(wt,ht);
        System.out.println("Maximum heart rate for age "+ag+"is "+max_hr+" "+"\n");
        System.out.println("Targeted heart rate for age "+ag+"is between"+thrL+" and "+thrU+"\n");
        System.out.println("Body Mass Index is "+bm);
	}

}

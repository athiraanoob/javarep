package Account;

public class Employee {
	String first_name;
	String last_name;
	double salary;
	public Employee(String first_name,String last_name,double salary)
	{
		this.first_name=first_name;
		this.last_name=last_name;
		this.salary=salary;
	}
	public void setf_name(String name)
	{
		this.first_name=name;
	}
    public void setl_name(String lname)
    {
    	this.last_name=lname;
    }
    public void setsalary(double salary)
    {
    	if (salary>0)
    	{
    	this.salary=salary;
    	}
    }
    
    public String getf_name()
	{
		return this.first_name;
	}
    public String getl_name()
    {
       return this.last_name;
    }
    public double getsalary()
    {
       return this.salary;
    }
    public double yearly_salary(double sal)
    {
    	Double yearly_salary=sal*12;
    	return yearly_salary;
    }
    public double IncAnnualSalary(double sal)
    {
//    	double incsal=(sal+(sal*(10/100)))*12;
    	double incsal=(sal*1.1)*12;

    	System.out.println("(sal+(sal*(10/100)))*12 : "+incsal);
    	return incsal;
    }
}

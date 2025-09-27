package Account;
import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1=new Employee("Akshita","Anoob",20000);
		Employee emp2=new Employee("Avanitha","Anoob",20000);
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the first name of first employee");
		String F_name= scn.next();
		emp1.setf_name(F_name);
		System.out.println("Enter the Last name of first employee");
		String L_name=scn.next();
		emp1.setl_name(L_name);
		System.out.println("Enter the Salary of first employee");
		double Salary=scn.nextDouble();
		emp1.setsalary(Salary);
		//System.out.println("Annual salary of that employee is");
		System.out.println("Employee First name :"+emp1.getf_name()+"Employee Last name :"+emp1.getl_name()+"Annual Salary :"+emp1.yearly_salary(emp1.getsalary()));
		System.out.println("After 10% increment Annual salary become");
		System.out.println("Employee First name :"+emp1.getf_name()+"Employee Last name :"+emp1.getl_name()+"Annual Salary After 10% increment :"+emp1.IncAnnualSalary(emp1.getsalary()));
		
		System.out.println("Enter the first name of Second employee");
		String F_name1 = scn.next();
		emp2.setf_name(F_name1);
		System.out.println("Enter the Last name of Second employee");
		String L_name1 = scn.next();
		emp2.setl_name(L_name1);
		System.out.println("Enter the Salary of Second employee");
		double Salary1 = scn.nextDouble();
		emp2.setsalary(Salary1);
		System.out.println("Annual salary of that Second employee is");
		System.out.println("Employee First name :" + emp2.getf_name() + "Employee Last name :" + emp2.getl_name()
				+ "Annual Salary :" + emp2.yearly_salary(emp2.getsalary()));
		System.out.println("After 10% increment Annual salary become");
		System.out.println("Employee First name :" + emp2.getf_name() + "Employee Last name :" + emp2.getl_name()
				+ "Annual Salary After 10% increment :" + emp2.IncAnnualSalary(emp2.getsalary()));
		   
		 		}

}

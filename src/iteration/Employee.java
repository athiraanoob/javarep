package iteration;

public class Employee {
	String employeeName;
	float hourlyRate;
	float numberOfHours;
	float grossPay;
	public Employee(String employeeName, float hourlyRate, float numberOfHours) {
		super();
		this.employeeName = employeeName; 
		this.hourlyRate = hourlyRate;
		this.numberOfHours = numberOfHours;
	}
	
	public void calculateGrossPay() {
		if(numberOfHours <= 40) {
			grossPay = numberOfHours * hourlyRate;
		} else {
			float excssHours = numberOfHours - 40;
			grossPay = (40 * hourlyRate) + (excssHours * hourlyRate * 1.5f);
		}
	}
	
	public void printEmployeeGrossPay() {
		System.out.println("Gross Pay for "+employeeName+" : "+grossPay);
	}
}

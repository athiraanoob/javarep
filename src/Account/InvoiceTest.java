package Account;
import java.util.Scanner;
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice inv=new Invoice("a1","Strong",5,3.5);
		System.out.println("Enter the part number");
		Scanner scn=new Scanner(System.in);
		String Part_no=scn.next();
		inv.setparnumber(Part_no);
		System.out.println("Enter part Description");
		String desc=scn.nextLine();
		inv.setpart_desc(desc);
		System.out.println("enter the quantity");
		int qnty=scn.nextInt();
		inv.setquantity(qnty);
		System.out.println("Enter the Price per item");
		double price=scn.nextDouble();
		inv.setprice(price);
		System.out.println("Display the Details \n");
		System.out.println("Part Number "+inv.getpartnumber()+"Part Deascription "+inv.getpart_desc()+"Quantity "+inv.getquantity()+"Price per Item"+inv.getprice());
		Double Invoiceamt=inv.getInvoiceAmound(qnty, price);
		System.out.println("Invoice amound is "+ Invoiceamt);
		
		}

}

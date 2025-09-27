package Account;

public class Invoice {

	
		String partnumber;
		String part_desc;
		int quantity;
		double price;
		public Invoice(String partnumber,String part_desc,int quantity,double price)
		{
		this.partnumber=partnumber;	
		this.part_desc=part_desc;
		this.quantity=quantity;
		this.price=price;
		}
		public void setparnumber(String partnumber)
		{
			this.partnumber=partnumber;
		}
		public void setpart_desc(String part_desc)
		{
			this.part_desc=part_desc;
		}
		public void setquantity(int quantity)
		{
			this.quantity=quantity;
		}
		public void setprice(double price)
		{
			this.price=price;
		}
		
		public String getpartnumber()
		{
			return this.partnumber;
		}
		public String getpart_desc()
		{
			return this.part_desc;
		}
		public int getquantity()
		{
			return this.quantity;
		}
		public double getprice()
		{
			return this.price;
		}
		public double getInvoiceAmound(int quantity, double price)
		{
			if (quantity<0)
			{
				quantity=0;
			}
			if (price<0)
			{
				price=0.0;
			}
			double invoice_amt=quantity* price;
			return invoice_amt;
		}

	}



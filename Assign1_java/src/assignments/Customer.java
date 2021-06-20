package assignments;

public class Customer {
	  int customerid;
	    String name;
	    int age;
	    String city;
	    int pincode;

	 Customer( int id, String n, int a, String c, int p)
	{
	this.customerid =id;
	this.name= n;
	this.age= a;
	this.city=c;
	this.pincode=p;
	}

	    Customer() {}
	        
	void setName(String n)
	{
	    name =n;
	}
	    String getName()
	{
	    return name;
	}
	    
	        void printDetails()
	{
	System.out.print(customerid);
	System.out.print(name);
	System.out.print(age);
	System.out.print(city);
	System.out.print(pincode);
	}

	public static void main(String[] args)
	{

	Customer ob1=new Customer(1,"garima",02,"b",6);
	   ob1.printDetails();
	}
	 }



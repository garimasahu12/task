package containment.Main;

import containment.emp.Employee;
import containment.java.MyDate;

public class ContainmentMain {
	   public static void main(String args[])
	    {
	MyDate ob=new MyDate ();
	           ob.setday(10);
	           ob.setmonth(1);
	           ob.setyear(1999);
	System.out.println("day is "+ob.getday());
	System.out.println("month is "+ob.getmonth());
	System.out.println("year is "+ob.getyear());


	Employee e=new Employee();
	    e.setempId(10);
	           e.setname("garima");
	           e.setbirthDate(new MyDate(2,3,1999));
	System.out.println("name is "+e.getname());
	System.out.println("empid is "+e.getempId());
	System.out.println("birthdate is "+e.getbirthDate());
	System.out.println("#########################");
	   e.display();

	   
	   Employee e1;
	        e1 = new Employee(43,"salena",new MyDate (3,9, 1999));
	        System.out.println("************");
	        e1.display();


	    }
}

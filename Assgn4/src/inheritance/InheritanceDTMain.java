/*
 * Author:Garima sahu
 * CreationDate:12/6/21
 * version:1.0.0
 * copyright:Sterlite Technologies Ltd.
 */


package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain 
{ public static void main(String args[])
	{
	Employee ob;
	 ob=  new Manager(2,"lele",1299.00,1.8f);
	
	((Manager)ob).showIncentives();
	
	WageEmp o = new WageEmp(3,"pl",9,9.0f);
	
	o.display();
	WageEmp j=(WageEmp)o;
	j.calculateWage();
	
	
	}
	
	

}

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

public class InheritanceMain {
	  public static void main(String args[]) 
      {
    	  Employee e =new Employee(1,"salena",200000.00);
    	  e.display();
    	  e.toString();
    	  System.out.println("");
    	  
    	  Manager m=new Manager(1,"salena",20000.00,(float) 29000.0);
    	  m.toString();
    	  m.showIncentives();
    	  m.details();
    	  
    	 WageEmp w=new WageEmp();
    	                   //  by default calculate wage 
    	 w.display();
    	 w.calculateWage();
    	 w.toString();
    	 
    	 WageEmp w1=new WageEmp(2,"priu",98,3.5f);
    	 //w1.WageEmp(2,3.5f);
    	 w1.display();                 //parameterized calculate wage
    	 w1.toString();
    	 
    	  }
      
}

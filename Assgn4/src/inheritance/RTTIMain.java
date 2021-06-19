package inheritance;


import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class RTTIMain {


	public static void showEmpInfo(Employee emp)
	{
		emp.display();
		if(emp instanceof Manager) {
				((Manager)emp).showIncentives();}
		
		
		if(emp instanceof WageEmp) {
			    ((WageEmp)emp).calculateWage();}
	}

	
	public static void main(String []args)
{
	Manager m=new Manager(1,"akki",2000,2.0f);
	showEmpInfo(m);
	
	WageEmp w=new WageEmp(1,"gomez",9,2.0f);
	showEmpInfo(w);
}
	
}

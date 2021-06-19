package inheritance.covariant;

import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovariantMain {
public static void main(String []args)
{
	EmployeeData o =new EmployeeData();
	Employee  e =o.getEmployee();
	e.display();
	
	ManagerData r =new ManagerData();
	Employee  y =r.getEmployee();
	y.display();
	
	WageEmpData w =new WageEmpData();
	Employee  p =w.getEmployee();
	p.display();
	
}
}

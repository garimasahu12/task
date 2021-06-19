package inheritance.emp.mgr;

import inheritance.emp.Employee;

public class Manager extends Employee 
{
	
public Manager()
{
	
	System.out.println("###########################");
	System.out.println("default constructor of manager");
	
		// TODO Auto-generated constructor stub
}

double incentives;

 public Manager(int empid, String name,double salary,float incentives)
{
	System.out.println("parameterized constructor of manager");
	this.empId=empid;
	this.incentives=incentives;
	this.salary=salary;
	this.name=name;
}
@Override
public String toString() 
{
	return "Manager [incentives=" + incentives + "]";
}

public void showIncentives()
{
	System.out.println("Incentives:"+incentives);
}
public void details()
{
System.out.println("empid: "+ empId+
        "\nname: "+name+
        "\nsalary: " +salary+ 
        "\nincentives: " +incentives);
System.out.println("");
}
public void Manager() {
	// TODO Auto-generated method stub
	
}

}


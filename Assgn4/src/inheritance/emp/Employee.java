
/*
 * Author:Garima sahu
 * CreationDate:12/6/21
 * version:1.0.0
 * copyright:Sterlite Technologies Ltd.
 */
package inheritance.emp;

public class Employee 
{
protected int empId;
protected String name;
protected double salary;

public Employee()
{
	System.out.println("####################");
	System.out.println("default constructor of Employee");
	System.out.println("");
	
}

public Employee(int empid,String name)
{
	System.out.println("parameterized constructor of employee");
	this.empId=empid;
	this.name=name;
}

public Employee(int empid,String name,double salary)
{
	System.out.println("parameterized constructor of employee");
	this.empId=empid;
	this.name=name;
	this.salary=salary;
}

public void display(){
    System.out.println("empid: "+ empId+
                     "\nname: "+name+
                     "\nsalary: " +salary);
    System.out.println("");
            }

public String toString()
{
return empId +"---"+name +"---"+salary;
}





}

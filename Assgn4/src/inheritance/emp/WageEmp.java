package inheritance.emp;

public class WageEmp extends Employee {
	private  String name;
	private  int empId;
	private  double salary;
	private int hours;
	 private float ratePerHour;
	 
	 public WageEmp()
	 {
		 hours=9;
		 ratePerHour=3.8f;
		 System.out.println("default constructor of wage emp");
	 }
	 
	 public WageEmp(int empId,String name,int hours,float ratePerHour)
	 {
		 this.empId=empId;
		 this.name=name;
		 this.hours=hours;
		 this.ratePerHour=ratePerHour;
		 
		 System.out.println("parametrized constructor of wage emp");
	 }
	 
	
	 public  void display()
	 {
		 System.out.println("wage's employee display");
		 super.display();
		 System.out.println("Hours:"+hours+
				            "\nRatePerHour"+ratePerHour);
		 System.out.println("");
	 }
	 
	 public void calculateWage()
	 {
		 float wage =hours*ratePerHour;
		 System.out.println("wage of employee: "+wage);
	 }

	@Override
	public String toString() {
		super.toString();
		return "WageEmp [hours=" + hours + ", ratePerHour=" + ratePerHour + "]";
	}
	 
}

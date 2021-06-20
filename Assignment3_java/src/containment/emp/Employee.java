package containment.emp;

import containment.java.MyDate;

public class Employee {
	 private int empId;
	    private String name;
	    private MyDate birthDate;
	    
	    public Employee()
	    {
	        empId =190;
	        name="salena";
	        birthDate =new MyDate();
	        System.out.println("Default constructor of employee");
	        System.out.println("");
	    }
	        
	     public   Employee(int empId, String name , MyDate birthDate)
	        {
	              this.empId=empId;
	        this.name=name;
	        this.birthDate=birthDate;
	        System.out.println("paramterized constructor");
	        }
	         
	        
	      public  void setempId(int n)
	{
	    empId =n;
	}
	   public  void setname(String n)
	{
	    name=n;
	}
	   public    void setbirthDate(MyDate n)
	{
	    birthDate =n;
	}
	  public   int getempId()
	{
	    return empId;
	}
	  public   String getname()
	    {
	        return name;
	    }
	 public    MyDate getbirthDate()
	    {
	        return birthDate;
	    }
	    
	    
	    
	      public void display(){
	         System.out.println("empId: "+ empId+
	                                        "\tname: "+name+
	                                        "\tbirthDate: " +birthDate);
	                 }
	      
	         public String toString()
	{
	return empId +"-"+name +"-"+birthDate;
	}

}

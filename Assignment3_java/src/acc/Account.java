package acc;

public class Account {
	private int accNo ;                     //instance variable (non static)
	 private String ownerName;
	 private double balance;
	 float durationYears;
	 
	 public static float interestRate=0.05f;               //class variable(static)
	 private static int count;
	 
	public Account()
	{
	    accNo=12;
	    ownerName="ga";
	            balance=100;
	            durationYears=1.9f;
	            count++;
	}
	    
	static
	{
	    interestRate=0.05f;
	System.out.println("static init block");
	}
	 


	Account(int accNo,   String ownerName,  double balance,   float durationYears)
	 {
	     this.accNo=accNo;
	     this.ownerName=ownerName;
	     this.balance=balance;
	     this.durationYears=durationYears;
	     count++;
	 }
	 
	 public static float getInterestRate() //class method (static)
	{
	    return interestRate;
	}
	   

	 public static void  setInterestRate(float interestRate)
	    {
	        Account.interestRate=interestRate;
	    }
	   
	    
	    void setaccNo(int n)
	{
	    accNo =n;
	}
	      void setownerName(String n)
	{
	    ownerName =n;
	}
	      void setbalance(int n)
	      {
	          balance=n;
	      }
	   void setdurationYears(float n)
	      {
	          durationYears=n;
	      }
	   int getaccNo()
	{
	    return accNo;
	}
	     String getownerName()
	{
	    return ownerName;
	}
	       double getbalance()
	{
	    return balance;
	}
	         float getdurationYears()
	{
	    return durationYears;
	}
	         
	         
	       public void calculateInterest()
	       {
	           double interestAmount;
	     interestAmount = (balance*durationYears*interestRate);
	           System.out.println("interestAmount="+interestAmount);
	       }
	     
	       
	       
	       public static int getCount()
	       {
	           return count;
	       }
	       
	      void printDetails()
	       {
	        System.out.println("accno."+accNo);
	System.out.println("ownername"+ownerName);
	System.out.println("balance"+balance);
	System.out.println("DurationYears"+durationYears);

	       }

}

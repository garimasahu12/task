package acc;

public class Bank {
	 public static void main(String args[])
	    {
	        System.out.println("main method");
	        float f=Account.getInterestRate();
	        
	        System.out.println("current Interest rate="+f);
	        
	        
	        
	        Account a=new Account();
	         
	         a.setaccNo(1);
	         a.setbalance(4000);
	         a.setdurationYears(4.0f);
	         a.setownerName("salena");
	          a.calculateInterest();
	                    System.out.println("acc no:"+a.getaccNo());
	         System.out.println("balance:"+a.getbalance());
	         System.out.println("ownername:"+a.getownerName());
	         System.out.println("years:"+a.getdurationYears());
	           
	         System.out.println("\n\n");
	        Account a1=new Account(4 , "salena"  , 7000  ,1.9f);
	          a1.calculateInterest();
	        a1.printDetails();
	     System.out.println("    No. of accounts:   "+Account.getCount());
	          }
	}


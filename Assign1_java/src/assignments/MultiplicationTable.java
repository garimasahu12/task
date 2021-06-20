package assignments;

import java.util.Scanner;

public class MultiplicationTable {
	public static void mulTable(int n){
	    System.out.println("The multiplication table is: ");
	    for(int i=1;i<=10;i++)
	    {
	        System.out.println(""+n+"*"+i+"="+(n*i));
	    }
	}
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	           System.out.println("Enter no.");
	        Scanner sc =new Scanner(System.in);
	        int p=sc.nextInt();
	        mulTable(p);
	    }
	    
	}



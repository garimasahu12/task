package assignments;

import java.util.Scanner;

public class ArmstrongNumberCount {
	  int x,sum,r;
	    public static void armstrongCount(int count )
	    {int c=1;
	    System.out.println(" The first "+count+" armstrong no.:");
	        while(count!=0)
	        {
	            c++;
	            int x=c;
	            int  sum = 0;
	            while(c!=0)
	            {
	                int r = c%10;
	                sum=sum+r*r*r;
	                c=c/10;
	            }
	            if(sum==x)
	            {
	                System.out.print(x+" ");
	                count--;
	            }
	            c=x;
	        }
	    }

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	        System.out.println("enter no.");
	        Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
	        armstrongCount( n);
	    }
	    
	}



package assignments;

import java.util.Scanner;

public class PrimeNumberCount {
	 public static void primeCount(int count)
	    {
	int i=1,p=2,f,c;
	System.out.println(" The first "+count+" prime no.:");
	while(i<=count)
	{
	f=1;
	for(c=2;c<=p-1;c++)
	{
	if(p%c==0)
	{
	f=0;
	break;
	}
	}
	if(f==1){
	System.out.println(p+" " );
	i++;
	}
	p++;
	}}
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here

	System.out.println("enter no.");
	        Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
	primeCount(n);
	       
	    }
	}


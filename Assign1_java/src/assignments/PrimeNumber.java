package assignments;


import java.util.Scanner;

/**
 *
 * @author GARIMA
 */
public class PrimeNumber {

public static String prime(int num)
{int b=1,c = 0;
    while(b<=num)
    {
        if(num%b==0)
            c=c+1;
        b++;
    }
    if(c==2)
    {
        System.out.println(num+"is a prime ");
    }
    else
    {
        System.out.println(num+"is a not a prime" );
    }
    return null;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter no.");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
    String prime = prime(n);
        
        
    }
    
}

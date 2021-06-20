package assignments;

import java.util.Scanner;

/**
 *
 * @author GARIMA
 */
public class ArmstrongNumber {
    public static void armstrong(int num)
    { int count=0, sum=0;
        int a =num;
        int c =num;
        while(a>0)
        {
            a=a/10;
            count++;
    }
        while(num>0)
        {
          int  b=num%10;
            sum=(int)(sum+Math.pow(b, count));
            num=num/10;
        }
        if(sum ==c)
        {
            System.out.println("is armstrong");
        }
        else
        {
            System.out.println("is not armstrong");
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
        armstrong(n);
    }
    
}

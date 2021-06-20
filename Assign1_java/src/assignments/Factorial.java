package assignments;

import java.util.Scanner;

/**
 *
 * @author GARIMA
 */
public class Factorial {
public static int fact(int num)
{
    if(num<1)
    {System.out.println("error occured");
    }
    if(num==0)
    {return 1;}
    if(num>1)
    {
        num= num*fact(num-1); 
    
    }
    return num;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, fact=1;
        System.out.println("enter the no.");
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
       fact= fact(n);
       System.out.println("fact of"+n+"is:"+fact);
    }
    
}

package assignments;

import java.util.Scanner;

public class StringReverse {
	public static String reverse(String str)
	{
	    String r="";
	    int length=str.length();
	    for(int i=length-1;i>=0;i--)
	        r=r+str.charAt(i);
	    System.out.println("reversed string:"+r);
	    return null;
	    
	}
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	        System.out.println("enter character");
	        Scanner sc =new Scanner(System.in);
	        String n=sc.nextLine();
	        reverse(n);
	    }
	    
	}



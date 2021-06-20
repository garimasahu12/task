package assignments;

import java.util.Scanner;

public class VowelCount {
	public static int countVowels(String str)
	{ int count =0;
	for(int i=0;i<str.length();i++)
	{
	    if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	    count++;
	}return count;
	}
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	         System.out.println("Enter the String : ");
	      Scanner sc=new Scanner(System.in);
	      String str= sc.nextLine();
	       
	      System.out.println("no. of vowels in the string:"+countVowels(str));
	    }
	    
}

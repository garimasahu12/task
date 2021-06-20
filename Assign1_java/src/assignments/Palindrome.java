package assignments;

import java.util.Scanner;

/**
 *
 * @author GARIMA
 */
public class Palindrome {
public static boolean checkPalindrome(String s){
    String String=s;
    char[] ch=s.toCharArray();
    StringBuilder str=new StringBuilder();
    for(int i=ch.length-1;i>=0;i--)
    {
        str.append(ch[i]);
    }
    
    String strFinal=str.toString();
    if(strFinal.equals(s))
    {
        return true;
    }
    else
   return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("Enter the String : ");
      Scanner sc=new Scanner(System.in);
      String n= sc.nextLine();
       
       boolean a=checkPalindrome(n);
if(a)
{
    System.out.println("String is palindrome");
}else
    System.out.println("String is not palindrome");
    }
    
}


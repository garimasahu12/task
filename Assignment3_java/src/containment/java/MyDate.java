package containment.java;

public class MyDate {
	 private int  month;
     private int year;//data members
 private int day;


     public   MyDate()// no argument or default constructor
        {
        
   int   day=9;
   int month=7;
   int  year=2009;
   System.out.println("  ");
   System.out.println("#########################");
   System.out.println("Default constructor of mydate");
 }


  public MyDate(int day,int month,int year)
 {
     this.day=day;
     this.month=month;
     this.year=year;
     System.out.println("paramterized constructor");
 }

public    void setday(int n)
{
 day =n;
}
public  void setmonth(int n)
{
 month=n;
}
public    void setyear(int n)
{
 year =n;
}
public int getday()
{
 return day;
}
public  int getmonth()
 {
     return month;
 }
public   int getyear()
 {
     return year;
 }

 public void printDate(){
      System.out.println(day+"/"+month+"/"+year);
 }

public String toString()
{
return day +"- "+month +"-"+year;
}
 
}

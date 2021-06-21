package setterandgetter;

public class MyDateSG {
	private int day,month,year;
    public void initDate()
      {
        day=8;
        month=7;
        year=2009;
    }
     public MyDateSG(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public MyDateSG()
    {
            System.out.println("default constructor");
     }
   void setday(int n)
{
    day =n;
}
     void setmonth(int n)
{
    month=n;
}
       void setyear(int n)
{
    year =n;
}
    int getday()
{
    return day;
}
    int getmonth()
    {
        return month;
    }
    int getyear()
    {
        return year;
    }
   public void printDate()
   {
         System.out.println(day+"/"+month+"/"+year);
    }
}

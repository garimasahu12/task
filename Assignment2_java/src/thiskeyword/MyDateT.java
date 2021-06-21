package thiskeyword;

public class MyDateT {
	private int day,month,year;
    public void initDate()
      {
        day=8;
        month=7;
        year=2009;
    }
     public MyDateT(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public MyDateT()
    {
            System.out.println("default constructor");
             MyDateT m0=new MyDateT(31,9,1900);
            
    }
  
    public void printDate(){
         System.out.println(day+"/"+month+"/"+year);
    }
  
    
}

package overloadconstructor;

public class MyDateP {
	private int day,month,year;
    public void initDate()
      {
        day=8;
        month=7;
        year=2009;
    }
    public MyDateP()
    {
        
    }
    public MyDateP(int d,int m,int y)
    {
        day=d;
        month=m;
        year=y;
    }
    public void printDate(){
         System.out.println(day+"/"+month+"/"+year);
    }
}

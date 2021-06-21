package setterandgetter;

public class DateMainSG {
	 public static void main(String args[])
	    {
	           MyDateSG ob=new MyDateSG ();
	           ob.setday(10);
	           ob.setmonth(1);
	           ob.setyear(1999);
	System.out.println(ob.getday());
	System.out.println(ob.getmonth());
	System.out.println(ob.getyear());

	MyDateSG ob1=new MyDateSG(1,6,1999);
	System.out.println(ob1.getday());
	System.out.println(ob1.getmonth());
	System.out.println(ob1.getyear());
	   
	    }
}

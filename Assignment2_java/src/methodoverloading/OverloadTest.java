package methodoverloading;

public class OverloadTest {
	 public static void main(String[] args)
	    {
	        MathEngine e=new MathEngine();
	        System.out.println(e.multiply(1, 9));
	        
	        e.multiply(9,7,7);
	         System.out.println(e.multiply(2.0f,4));
	          System.out.println(e.multiply(1, 9.0f));
	    }
}

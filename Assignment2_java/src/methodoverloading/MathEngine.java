package methodoverloading;

public class MathEngine {
	int multiply(int a,int b)
	{
	    return (a*b);
	}
	    float multiply(float a,int b)
	    {
	        return (a*b);
	    }
	    void multiply(int s,int e,int d )
	    {
	        System.out.println(s*e*d);
	    }
	     float multiply(int a,float b)
	    {
	        return (a*b);
	    }
	   
}

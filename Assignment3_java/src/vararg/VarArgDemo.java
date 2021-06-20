package vararg;

public class VarArgDemo {
	static double average(int... a)
    {
        
      int n=a.length;
      int s=0;
      for(int i:a)
      {
          s=s+i;
      }
      return (s/n);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(average(10,20,60));
    }
    
}

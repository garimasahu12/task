package foreach2;

public class ForEach2Demo {
	public static void main(String[] args) {
        // TODO code application logic here
        double arr[]=new double[5];
           for(double s:arr)
            System.out.println(s);
        
        
        float arr1 [ ]= {1.2f,5.6f,9.0f};
        for(float y:arr1)
              System.out.println(y);
        
        String arr2[]={"R","l","m","d"};
        for(String x:arr2)
            System.out.println(x);
        
        String arr3[]=new String[3];
        arr3[0]="i";
        arr3[1]="e";
        arr3[2]="j";
        System.out.println( );
        for(String a:arr3)
             System.out.println(a);
    }
    
}



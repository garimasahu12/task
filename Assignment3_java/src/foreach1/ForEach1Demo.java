package foreach1;

public class ForEach1Demo {
	public static void main(String[] args) {
        // TODO code application logic here
        
         int [][] arr2D=new int[2][4];
         arr2D[0][1]=1;
         arr2D[1][1]=2;
         
        
        for(int[] b:arr2D)
        
            for(int e:b)
            System.out.println(e);
       int arr2[][]={{1,98},{20,49,50,60}};
       System.out.println(  );
       
        for(int[]c:arr2)
            for(int d:c)
            System.out.println(d);
        
        
    }
}

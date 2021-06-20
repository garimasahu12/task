package array;

public class ArrayDemo {
	public static void main(String[] args) {
        // TODO code application logic here
        
        
           int arr[] =new int[5];  //with using new keyword
            System.out.println("with using new keyword array");
           for(int i=0;i<arr.length;i++)
           {
                
               System.out.println(arr[i]);
             }
  
           
           
           int ar[]={1,2};//without using new keyword           
           System.out.println("without using new keyword array");
            for(int i=0;i<ar.length;i++)
           {
               
               System.out.println(ar[i]);
             }
           
             
            
            
            String arr2[]={"Ranchi","lsrail","mumbai","delhi"};
                System.out.println("without using new keyword string");
                  for(int i=0;i<arr2.length;i++)
           {
              
               System.out.println(arr2[i]);
            }
                  
                  
           String arr3[]={"dancing","music","reading books","gardening"};       
            System.out.println("without using new keyword string");
                  for(int i=0;i<arr3.length;i++)
           {
              
               System.out.println(arr3[i]);
            }
    }
    
}

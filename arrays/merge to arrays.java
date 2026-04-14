public class Main
{
	public static void main(String[] args) {
	    
	   int[] arr1={20,30,42,11}; 
	   int[] arr2={40,50,24,25};
	   int[] arr3= new int[arr1.length+arr2.length];
	   

	   for(int i=0; i<arr1.length; i++)
	   {
	       arr3[i]=arr1[i];
	        
	   }
	    for(int j=0; j<arr2.length; j++)
	   {
	       arr3[j+arr1.length]=arr2[j];
	        
	   }
	   for(int i:arr3)
		System.out.println(i);
	}
}

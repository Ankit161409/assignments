public class Main
{
	public static void main(String[] args) {
	    int[] arr={23,32,13,45,34,56,74};
	    
	    int len=arr.length-1;
	    
	    int r=2;

	    
	    for(int j=0; j<r; j++)
	    
	    {	    int first=arr[0];
	    for(int i=0; i<len; i++)
	    {
	        arr[i]=arr[i+1];
	        
	    }
	   arr[len]=first;
	    }
	     
	    for(int i:arr)
	    {
		System.out.print(i+" ");
	}
}
}

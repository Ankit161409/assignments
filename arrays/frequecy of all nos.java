import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={2,3,2,2,3,4,6,3,3,5,4,6,4,4,2,3,4 };
	    int n=arr.length;
	  int i;
	     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	    for(i=0; i<n; i++)
	    {   int count=0;
	          for(int j=0; j<n; j++)
	        {
	            if(arr[i]==arr[j])
	            {
	            count++;
	            }
	        }
	 
	        map.put(arr[i],count);
	        
	        	System.out.println(arr[i]+" = "+count);
	    }
	    	System.out.println(map);
	
	}
}

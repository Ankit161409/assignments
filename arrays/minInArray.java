public class Main
{
	public static void main(String[] args) {
	    
	    int[] arr = {30,92,11,29,32};
	    int min=arr[0];
	    for(int i=0; i<arr.length; i++)
	    {
	        if(min>arr[i])
	        min=arr[i];
	    }
		System.out.println(min);
	}
}

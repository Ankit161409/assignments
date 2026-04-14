public class Main
{
	public static void main(String[] args) {
	  int[] arr={30,40,32,34} ; 
	  int len=arr.length;

	  int[] arr2=new int[arr.length];
	  
	  for(int i=len-1; i>=0; i--)
	  {
	     arr2[arr.length-1-i]=arr[i];
	  }
	  for(int i : arr2)
		System.out.println("reversed array : "+ i);
	}
}
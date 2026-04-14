import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={49,23,23,25,52};
	    
	    Set<Integer> st= new HashSet<Integer>();
	    for(int i: arr )
	    {
	    st.add(i);
		}System.out.println(st);
	}
}
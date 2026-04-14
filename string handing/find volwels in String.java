public class Main
{
	public static void main(String[] args) {
	 
	 String s="ankit";
	 int count=0;
	int consonents=0;
	 for(int i=0; i<s.length(); i++)
	 {
	     if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
	     {
	         count++;
	     }
	 
	 else
	 {
	     consonents++;
	 }
	 }
		System.out.println("vovels : "+count);
		System.out.println("consonents :"+consonents);
	}
}
  public class temp{
      static demo d;
      static{
          System.out.println("static block from temp");
          d=new demo();
      } public static void main(String[] args){
            System.out.println("  main");
      }
  }
   class demo
   {
       void show(int x)
      { 
      System.out.println( x);}}
      
      class temp1{
        public static void main(String[] args){
            System.out.println(" main from temp1");
           temp.d.show(10);
        }
      }
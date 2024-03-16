public class Fibo{
 public static void main(String X[])
{ 
  int f1=0,f2=1,fib;
   System.out.println(" fibonachi series\n "+f1 +" \n"+f2);
   for(int i=2;i<10;i++)
   {
      fib=f1+f2;
      System.out.println(" "+fib);
      f1=f2;
      f2=fib;
     
   
   }
}




}
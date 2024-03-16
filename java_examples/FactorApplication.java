import java.util.*;

class Factorial{
  private int y;
  void setValue(int y)
  {
    this.y=y;
  }
  int getFactorial()
  {
   int fact=1; 
      for(int i=1;i<=y;i++)
      {
         fact=fact*i;
      }
     
     return fact;
  }
   
}
public class FactorApplication{
 
  public static void main(String x[]){

     int y;
    Scanner s= new Scanner(System.in);
    System.out.println("enter number ");
    y=s.nextInt();
   Factorial f= new Factorial();
   f.setValue(y);
   int result= f.getFactorial();
   System.out.println("factorial of number is"+result); 
  }


}
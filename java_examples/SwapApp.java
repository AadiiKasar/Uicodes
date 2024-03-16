public class SwapApp{

public static void main(String x[])
{  
   int a,b,c;
    a=Integer.parseInt(x[0]);
    b=Integer.parseInt(x[1]);
 System.out.println("before swapping numbers: "+a + b);  
       
       a=a+b;
       b=a-b;
       a=a-b; 
       System.out.println("After swapping: "+a  + b);  
       




}

}
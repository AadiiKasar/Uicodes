import java.util.Scanner;
public class Adi{
  
 public static void main(String x[])
 {Scanner s = new Scanner(System.in);

  int base,index,p=1;
  System.out.println("base index");
   base=s.nextInt();
   index=s.nextInt();
   for(int i=1;i<=index;i++)
   {p=p*base;
   }
   System.out.println("power is "+p);


 }



}
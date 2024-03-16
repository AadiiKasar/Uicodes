
public class Factor{

public static void main (String X[])
{
 int i,a,b,j=1,c=0;
 a=Integer.parseInt(X[0]);
 for( i=1;i<a;i++)
 {
   if(a%i==0)
   {
     
     System.out.println("fac\n"+i);
     
   
   for( j=1;j<=i;j++)
   {
     if(i%j==0)
     {
       ++c;
     }
   } if(c==2)
   {
     System.out.println("\nprime factor\n"+i);

   }
  
    }
   c=0;
 }

 





}




}
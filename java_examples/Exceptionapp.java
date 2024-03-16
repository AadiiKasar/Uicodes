 
import java.util.*;
public class Exceptionapp {
 static int v[];
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Arithmatic operation\n"
  
  + "2.Nullpointerexception\n"
  + "3.Classnotfoundexception\n"
 );
System.out.println("enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
 System.out.println("enter two values");
 int a=sc.nextInt();
 int b=sc.nextInt();
 try
 {
  int c=a/b;
  System.out.println("division of two number is" +c);
 }
 catch(ArithmeticException ex)
 {
  System.out.println("exception handling" +ex);
 }
 System.out.println("Logic1 is exected");
 System.out.println("Logic2 is exeuted");
break;

case 2:
 
 try{
      v[0]=100;
       System.out.println(v[0]);
    }
    catch(NullPointerException ex)
     { 
     System.out.println("Allocate memory for array");
        System.out.println("Error is "+ex);
     }
  break;
case 3:
 try
 {
  Class.forName("com.delver");
 }
 catch(ClassNotFoundException ex)
 {
  System.out.println("error is" +ex);
 }
 break;


}

}
}

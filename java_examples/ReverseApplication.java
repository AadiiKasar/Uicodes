import java.util.Scanner;
public class ReverseApplication{
  public static void main(String[] args) 
 {

	int number,reverse=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number to reverse");
        number=s.nextInt();
       while(number != 0)   
       {  
         int remainder = number%10;  
           reverse = reverse*10 + remainder;  
          number = number/10;  
        }  
  
    System.out.println("reverse number is"+reverse);

 }


}
import java.util.Scanner;
public class CheckApp{

 public static void main(String y[]){
       
     Scanner s= new Scanner(System.in);
    char x;
     x=s.next().charAt(0);
    System.out.println("nter number to check ");
    
   if(x>='a' && x<='z'||x>='A' && x<='Z' ){
        System.out.println("x is alphabet"+x);
      }else if(x>='0' && x<='9'){
            System.out.println("x is number"+x);

        }
       else{

                    System.out.println("x is special symbol"+x);
                
             }
       
  }

}
import java.util.Scanner;

class Cube{
   
 private int y;
  void setValue(int y)
  {
     this.y=y;
  }
 int getCube()
 {
   return y*y*y;
 }



}

public class CubeApp{
 public static void main(String x[]){
 Scanner s = new Scanner(System.in);
  System.out.println("enter number to be converted to cube");
   int y=s.nextInt();
  Cube c= new Cube();
  c.setValue(y);
 int result=c.getCube();
System.out.println("cube is resulted to"+result);


}



}
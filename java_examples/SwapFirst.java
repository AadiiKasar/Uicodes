public class SwapFirst{

public static void main(String x[])
{
  int first,last,temp,n,mid,c=0,m=1;
  n=Integer.parseInt(x[0]);
  temp=n;  
while(n!=0)
  {
    n=n/10;
    m=m*10;
    c++;
  }
  n=temp;
 last=n%10;
 n=n/10;
 mid=n%(m/100);
 first=n/(m/100);
 temp=last*(m/10)+mid*10+first;
 System.out.println("after swapping"+temp);
  



}



}
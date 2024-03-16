import java.util.Scanner;
class MergeTwoArray{

   int y[],z[],size  ;
   MergeTwoArray(int y[],int z[],int size){
              this.y=y;
              this.z=z;
              this.size=size;
       
    }
      int q[]=new int[2*size];
  public void getMergeArray(){
    int j=0;

    for(int k=0;k<q.length;k++){
     if(k<q.length)
     {

         q[k]=y[k];
       
     }
     else{
            q[k]=z[j];
            j++;
         }
     System.out.println("Array after merge");
      for(int i=0;i<q.length;i++)
      {
         System.out.println(q[i]);

     
      }  
    }    

 }   
}

public class ArrayMergeApp{
        public static void main(String [] args){
                   Scanner  s= new Scanner(System.in);
         System.out.println("entet size");
         int size= s.nextInt();
         int y[]= new int[size];
          int z[]=new int[size];

         System.out.println("enter first array");
         for(int i=0;i<y.length;i++)
         {
            
             y[i]=s.nextInt();
             
             


         }
            System.out.println("enter second array");
         for(int i=0;i<z.length;i++)
         {
           
             z[i]=s.nextInt();
             
        
         }
          
     MergeTwoArray m= new MergeTwoArray(y,z,size) ;
       
      m.getMergeArray();   

  }



}
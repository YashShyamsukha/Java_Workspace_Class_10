import java.util.Scanner;
import java.lang.Math;


public class Nar {
   public boolean is_Nar(int x) {
      int x1=x, x2=x, r=0, f=0;
      while(x1>0) {
         x1/=10;
         f++;
      }
      while(x2>0){
         int d = x2%10;
         r += Math.pow(d,f);
         x2/=10;
      }
      return r==x;
   }

   public static void main(String[]args){
      Nar nar = new Nar();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter two no.");
      int n1 = scanner.nextInt();
      int n2 = scanner.nextInt();
      int count = 0;
      for(int i =n1+1;i<n2;i++){
         if(nar.is_Nar(i)) {
            System.out.println(i);
            count++;
         }
      }
      System.out.println("Number of narcissistic between "+n1+" and "+n2+" are : "+count);
   }
}

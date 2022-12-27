import java.util.Scanner;

public class Tech {
    public boolean is_Tech(int x){
        int x1 =x,f=0,p=0;
        while (x1>0){
            x1/=10;
            f++;
        }
        if(f%2!=0)
            return false;
        else {
            p=x/(int)(Math.pow(10,f/2))+x%(int)(Math.pow(10,f/2));
                return p*p==x;
        }
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Tech tech = new Tech();
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        System.out.println(tech.is_Tech(n));
    }
}

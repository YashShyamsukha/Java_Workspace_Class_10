import java.util.Scanner;

public class Xylem {
    public boolean xylem_or_pholem(int n)
    {
        int n1=n,s=0,f=0,extreme=0,mean=0;
        while (n1>0){
            int d = n1%10;
            s+=d;
            f++;
            n1/=10;
        }
        extreme = n%10 + n/(int)(Math.pow(10,f-1));
        mean = s - extreme;
        return mean==extreme;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Xylem xylem = new Xylem();
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        if(xylem.xylem_or_pholem(n))
            System.out.println("Xylem number");
        else
            System.out.println("Phloem number");
    }
}

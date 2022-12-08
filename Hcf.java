import java.util.Scanner;

public class Hcf {
    public int Hcf_of_two(int a, int b) {
        while (true) {
            int r = a % b;
            if (r == 0)
                return b;
            else {
                a = b;
                b = r;
            }
        }
    }

    public int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
             f*=i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hcf hcf = new Hcf();
        System.out.println("Enter two num");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = hcf.fact(n)/(hcf.fact(m)*hcf.fact(n-m));
        System.out.println(s);
    }
}
